using System;
using System.Collections.Generic;
using server;
using System.Windows.Forms;

namespace client
{
    public partial class frmAdd : Form
    {
        Table table = null;
        public frmAdd()
        {
            InitializeComponent();
        }

        private void frmAdd_Load(object sender, EventArgs e)
        {
            
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }
        public Table getTable
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
                table = new Table();
                table.setName(cmbAdress.SelectedItem.ToString());
                table.setYsluga(cmbYsluga.SelectedItem.ToString());
                table.setTarif(cmbTarif.SelectedItem.ToString());
                table.setRazmer(Convert.ToInt32(spn1.Value));
                table.setIspol(cmbIspol.SelectedItem.ToString());
                table.setOtvet(cmbOtvet.SelectedItem.ToString());
                table.setPrice(Convert.ToInt32(txt.Text));
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
