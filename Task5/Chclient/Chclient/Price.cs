using System;
using System.Windows.Forms;

namespace Chclient
{
    public partial class Price : Form
    {
        public Price()
        {
            InitializeComponent();
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
