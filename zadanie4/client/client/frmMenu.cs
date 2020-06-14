using System;
using server;
using System.Collections.Generic;
using System.Runtime.Remoting;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;
using System.Windows.Forms;

namespace client
{
    public partial class frmMenu : Form
    {
        public frmMenu()
        {
            InitializeComponent();
        }
        private void button5_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form1 f = new Form1();
            f.ShowDialog();
        }

        private void frmMenu_Load(object sender, EventArgs e)
        {
            TcpClientChannel chan = new TcpClientChannel();
            ChannelServices.RegisterChannel(chan, false);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Price f = new Price();
            f.ShowDialog();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Adress f = new Adress();
            f.ShowDialog();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Kom f = new Kom();
            f.ShowDialog();
        }
    }
}
