using System;
using System.Collections.Generic;
using server;
using System.Windows.Forms;

namespace client
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void doVivod(List<server.Table> lstTable)
        {
            lvList.Items.Clear();
            int i = 1;
            foreach (server.Table table in lstTable)
            {
                ListViewItem newItem = new ListViewItem(i++.ToString());
                lvList.Items.Add(newItem);
                newItem.SubItems.Add(table.getName());
                newItem.SubItems.Add(table.getYsluga());
                newItem.SubItems.Add(table.getTarif());
                newItem.SubItems.Add(table.getRazmer().ToString());
                newItem.SubItems.Add(table.getIspol());
                newItem.SubItems.Add(table.getOtvet());
                newItem.SubItems.Add(table.getPrice().ToString());
            }
        }
        TableOperation tableOperation = null;
        private void Form1_Load(object sender, EventArgs e)
        {
            try
            {
                tableOperation = (TableOperation)Activator.GetObject(
                typeof(TableOperation), "tcp://localhost:9000/TalkIsGood");
                doVivod(tableOperation.getListOfDogovor());
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }

        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            frmAdd f = new frmAdd();
            f.ShowDialog();
            if (f.getTable != null)
            {
                try
                {
                    doVivod(tableOperation.addNewDogovor(f.getTable));
                }
                catch (Exception ex)
                {
                    MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }

        private void btnUpdate_Click(object sender, EventArgs e)
        {
            try
            {
                doVivod(tableOperation.getListOfDogovor());
            }
            catch (Exception ex)
            {
                MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }

        }

        private void btnDel_Click(object sender, EventArgs e)
        {
            if (lvList.SelectedIndices.Count < 1)
            {
                MessageBox.Show(this, "Выберите элемент для удаления!", "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return;
            }
            else
            {
                try
                {
                    tableOperation.DelDogovor(lvList.SelectedIndices[0]);
                    doVivod(tableOperation.getListOfDogovor());
                }
                catch (Exception ex)
                {
                    MessageBox.Show(this, "Ошибка соединения: +" + ex, "Сообщение об ошибке", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
