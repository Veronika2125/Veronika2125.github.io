using System;
using System.Windows.Forms;

namespace Chclient
{
    public partial class frmAdd : Form
    {
        public frmAdd()
        {
            InitializeComponent();
        }
        localhost.TableServiceService tableService = new localhost.TableServiceService();
        localhost.table table = null;
        private void frmAdd_Load(object sender, EventArgs e)
        {
            
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        public localhost.table getTable
        {
            get
            {
                return table;
            }
        }

        private void btnAddForm_Click(object sender, EventArgs e)
        {
            try
            {
                table  = new localhost.table();
                table.name = cmbAdress.SelectedItem.ToString();
                table.ysluga = cmbYsluga.SelectedItem.ToString();
                table.tarif = cmbTarif.SelectedItem.ToString();
                table.razmer = Convert.ToInt32(spn1.Value);
                table.ispol = cmbIspol.SelectedItem.ToString();
                table.otvet = cmbOtvet.SelectedItem.ToString();
                table.price = Convert.ToInt32(txt.Text);
                this.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка: " + "Некорректный ввод. Попытайтесь снова", "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void btnDeside_Click(object sender, EventArgs e)
        {
            float sum = 0;
            switch (cmbYsluga.SelectedItem.ToString())
            {
                case "Вывоз мусора": { sum = (43 * (float)spn1.Value); break; }
                case "Уборка двора": { sum = (50 * (float)spn1.Value); break; }
                case "Уборка подъезда": { sum = (30 * (float)spn1.Value); break; }
                case "Ремонт крыши": { sum = (1100 * (float)spn1.Value); break; }
                case "Ремонт лифта": { sum = (90 * (float)spn1.Value); break; }
                case "Ремонт водопровода": case "Ремонт газопровода": case "Ремонт электропровода": { sum = (100 * (float)spn1.Value); break; }
            }
            txt.Text = sum.ToString();
        }
    }
}
