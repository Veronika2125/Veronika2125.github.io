using System;
using System.Windows.Forms;

namespace Chclient
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        localhost.TableServiceService tableService = new localhost.TableServiceService();
        private void doVivod(localhost.table[] lstTable)
        {
            lvList.Items.Clear();
            int i = 1;
            foreach (localhost.table table in lstTable)
            {
                ListViewItem newItem = new ListViewItem(i++.ToString());
                lvList.Items.Add(newItem);
                newItem.SubItems.Add(table.name);
                newItem.SubItems.Add(table.ysluga);
                newItem.SubItems.Add(table.tarif);
                newItem.SubItems.Add(table.razmer.ToString());
                newItem.SubItems.Add(table.ispol);
                newItem.SubItems.Add(table.otvet);
                newItem.SubItems.Add(table.price.ToString());
            }
        }
        private void Form1_Load(object sender, EventArgs e)
        {
            try
            {
                doVivod(tableService.getAllTovar());
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
                    doVivod(tableService.setNewDogovor(f.getTable));
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
                doVivod(tableService.getAllTovar());
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
                    tableService.delDogovor(lvList.SelectedIndices[0]);
                    doVivod(tableService.getAllTovar());
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
