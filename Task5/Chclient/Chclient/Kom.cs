using System;
using System.Windows.Forms;

namespace Chclient
{
    public partial class Kom : Form
    {
        public Kom()
        {
            InitializeComponent();
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
