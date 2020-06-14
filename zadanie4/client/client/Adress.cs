using System;
using server;
using System.Collections.Generic;
using System.Windows.Forms;

namespace client
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
        TableOperation tableOperation = null;
        private void Adress_Load(object sender, EventArgs e)
        {
            try
            {
                tableOperation = (TableOperation)Activator.GetObject(
                typeof(TableOperation), "tcp://localhost:9000/TalkIsGood");
                textBox1.Text = tableOperation.getNumber("ул. Радужная, д. 15").ToString();
                textBox2.Text = tableOperation.getNumber("ул. Радужная, д. 16").ToString();
                textBox3.Text = tableOperation.getNumber("ул. Радужная, д. 16а").ToString();
                textBox4.Text = tableOperation.getNumber("ул. Радужная, д. 17").ToString();
                textBox5.Text = tableOperation.getNumber("ул. Радужная, д. 17а").ToString();
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }
    }
}
