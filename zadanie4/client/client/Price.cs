using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace client
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
