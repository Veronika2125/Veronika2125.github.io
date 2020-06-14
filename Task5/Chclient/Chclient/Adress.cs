using System;
using System.Windows.Forms;

namespace Chclient
{
    public partial class Adress : Form
    {
        public Adress()
        {
            InitializeComponent();
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }
        localhost.TableServiceService tableService = new localhost.TableServiceService();
        private void Adress_Load(object sender, EventArgs e)
        {
            try
            {
                
                textBox1.Text = tableService.getNumber("ул. Радужная, д. 15").ToString();
                textBox2.Text = tableService.getNumber("ул. Радужная, д. 16").ToString();
                textBox3.Text = tableService.getNumber("ул. Радужная, д. 16а").ToString();
                textBox4.Text = tableService.getNumber("ул. Радужная, д. 17").ToString();
                textBox5.Text = tableService.getNumber("ул. Радужная, д. 17а").ToString();
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }
    }
}
