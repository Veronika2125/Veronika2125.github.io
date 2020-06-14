namespace client
{
    partial class frmAdd
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblAdress = new System.Windows.Forms.Label();
            this.lblYsluga = new System.Windows.Forms.Label();
            this.lblTarif = new System.Windows.Forms.Label();
            this.lblRazmer = new System.Windows.Forms.Label();
            this.lblInspol = new System.Windows.Forms.Label();
            this.lblOtvet = new System.Windows.Forms.Label();
            this.lblSum = new System.Windows.Forms.Label();
            this.cmbAdress = new System.Windows.Forms.ComboBox();
            this.cmbYsluga = new System.Windows.Forms.ComboBox();
            this.cmbTarif = new System.Windows.Forms.ComboBox();
            this.spn1 = new System.Windows.Forms.NumericUpDown();
            this.cmbIspol = new System.Windows.Forms.ComboBox();
            this.cmbOtvet = new System.Windows.Forms.ComboBox();
            this.txt = new System.Windows.Forms.TextBox();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.btnAddForm = new System.Windows.Forms.ToolStripMenuItem();
            this.btnDeside = new System.Windows.Forms.ToolStripMenuItem();
            this.btnCancel = new System.Windows.Forms.ToolStripMenuItem();
            ((System.ComponentModel.ISupportInitialize)(this.spn1)).BeginInit();
            this.menuStrip1.SuspendLayout();
            this.SuspendLayout();
            // 
            // lblAdress
            // 
            this.lblAdress.AutoSize = true;
            this.lblAdress.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblAdress.Location = new System.Drawing.Point(29, 47);
            this.lblAdress.Name = "lblAdress";
            this.lblAdress.Size = new System.Drawing.Size(111, 20);
            this.lblAdress.TabIndex = 0;
            this.lblAdress.Text = "Адрес дома";
            // 
            // lblYsluga
            // 
            this.lblYsluga.AutoSize = true;
            this.lblYsluga.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblYsluga.Location = new System.Drawing.Point(29, 88);
            this.lblYsluga.Name = "lblYsluga";
            this.lblYsluga.Size = new System.Drawing.Size(65, 20);
            this.lblYsluga.TabIndex = 0;
            this.lblYsluga.Text = "Услуга";
            // 
            // lblTarif
            // 
            this.lblTarif.AutoSize = true;
            this.lblTarif.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblTarif.Location = new System.Drawing.Point(29, 125);
            this.lblTarif.Name = "lblTarif";
            this.lblTarif.Size = new System.Drawing.Size(114, 20);
            this.lblTarif.TabIndex = 0;
            this.lblTarif.Text = "Вид тарифа";
            // 
            // lblRazmer
            // 
            this.lblRazmer.AutoSize = true;
            this.lblRazmer.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblRazmer.Location = new System.Drawing.Point(29, 164);
            this.lblRazmer.Name = "lblRazmer";
            this.lblRazmer.Size = new System.Drawing.Size(71, 20);
            this.lblRazmer.TabIndex = 0;
            this.lblRazmer.Text = "Размер";
            // 
            // lblInspol
            // 
            this.lblInspol.AutoSize = true;
            this.lblInspol.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblInspol.Location = new System.Drawing.Point(29, 206);
            this.lblInspol.Name = "lblInspol";
            this.lblInspol.Size = new System.Drawing.Size(119, 20);
            this.lblInspol.TabIndex = 0;
            this.lblInspol.Text = "Исполнитель";
            // 
            // lblOtvet
            // 
            this.lblOtvet.AutoSize = true;
            this.lblOtvet.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblOtvet.Location = new System.Drawing.Point(29, 246);
            this.lblOtvet.Name = "lblOtvet";
            this.lblOtvet.Size = new System.Drawing.Size(143, 20);
            this.lblOtvet.TabIndex = 0;
            this.lblOtvet.Text = "Ответственный";
            // 
            // lblSum
            // 
            this.lblSum.AutoSize = true;
            this.lblSum.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.lblSum.Location = new System.Drawing.Point(29, 283);
            this.lblSum.Name = "lblSum";
            this.lblSum.Size = new System.Drawing.Size(63, 20);
            this.lblSum.TabIndex = 0;
            this.lblSum.Text = "Сумма";
            // 
            // cmbAdress
            // 
            this.cmbAdress.FormattingEnabled = true;
            this.cmbAdress.Items.AddRange(new object[] {
            "ул. Радужная, д. 15",
            "ул. Радужная, д. 16",
            "ул. Радужная, д. 16а",
            "ул. Радужная, д. 17",
            "ул. Радужная, д. 17а"});
            this.cmbAdress.Location = new System.Drawing.Point(259, 47);
            this.cmbAdress.Name = "cmbAdress";
            this.cmbAdress.Size = new System.Drawing.Size(225, 24);
            this.cmbAdress.TabIndex = 1;
            // 
            // cmbYsluga
            // 
            this.cmbYsluga.FormattingEnabled = true;
            this.cmbYsluga.Items.AddRange(new object[] {
            "Вывоз мусора",
            "Уборка двора",
            "Уборка подъезда",
            "Ремонт крыши",
            "Ремонт лифта",
            "Ремонт водопровода",
            "Ремонт газопровода",
            "Ремонт электропровода"});
            this.cmbYsluga.Location = new System.Drawing.Point(259, 84);
            this.cmbYsluga.Name = "cmbYsluga";
            this.cmbYsluga.Size = new System.Drawing.Size(225, 24);
            this.cmbYsluga.TabIndex = 1;
            // 
            // cmbTarif
            // 
            this.cmbTarif.FormattingEnabled = true;
            this.cmbTarif.Items.AddRange(new object[] {
            "По количеству",
            "По площади"});
            this.cmbTarif.Location = new System.Drawing.Point(259, 121);
            this.cmbTarif.Name = "cmbTarif";
            this.cmbTarif.Size = new System.Drawing.Size(225, 24);
            this.cmbTarif.TabIndex = 1;
            // 
            // spn1
            // 
            this.spn1.Location = new System.Drawing.Point(259, 161);
            this.spn1.Minimum = new decimal(new int[] {
            1,
            0,
            0,
            0});
            this.spn1.Name = "spn1";
            this.spn1.Size = new System.Drawing.Size(72, 22);
            this.spn1.TabIndex = 2;
            this.spn1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.spn1.Value = new decimal(new int[] {
            30,
            0,
            0,
            0});
            // 
            // cmbIspol
            // 
            this.cmbIspol.FormattingEnabled = true;
            this.cmbIspol.Items.AddRange(new object[] {
            "ООО \"Молоток\"",
            "ООО \"Капля\"",
            "ООО \"Газ\"",
            "ООО \"Искра\"",
            "Дворник",
            "Уборщик",
            "Сварщик",
            "Строители",
            "Бухгалтер",
            "Бригадир"});
            this.cmbIspol.Location = new System.Drawing.Point(259, 202);
            this.cmbIspol.Name = "cmbIspol";
            this.cmbIspol.Size = new System.Drawing.Size(225, 24);
            this.cmbIspol.TabIndex = 1;
            // 
            // cmbOtvet
            // 
            this.cmbOtvet.FormattingEnabled = true;
            this.cmbOtvet.Items.AddRange(new object[] {
            "Иванов Юрий Михайлович - Председатель ТСЖ",
            "Петров Игорь Валерьевич - Член правления",
            "Петренко Светлана Геннадьевна - Член правления",
            "Добростина Анна Михайловна - Член правления"});
            this.cmbOtvet.Location = new System.Drawing.Point(259, 242);
            this.cmbOtvet.Name = "cmbOtvet";
            this.cmbOtvet.Size = new System.Drawing.Size(225, 24);
            this.cmbOtvet.TabIndex = 1;
            // 
            // txt
            // 
            this.txt.Location = new System.Drawing.Point(259, 283);
            this.txt.Name = "txt";
            this.txt.ReadOnly = true;
            this.txt.Size = new System.Drawing.Size(225, 22);
            this.txt.TabIndex = 3;
            // 
            // menuStrip1
            // 
            this.menuStrip1.ImageScalingSize = new System.Drawing.Size(20, 20);
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.btnAddForm,
            this.btnDeside,
            this.btnCancel});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(511, 28);
            this.menuStrip1.TabIndex = 4;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // btnAddForm
            // 
            this.btnAddForm.Name = "btnAddForm";
            this.btnAddForm.Size = new System.Drawing.Size(90, 24);
            this.btnAddForm.Text = "Добавить";
            this.btnAddForm.Click += new System.EventHandler(this.btnAddForm_Click);
            // 
            // btnDeside
            // 
            this.btnDeside.Name = "btnDeside";
            this.btnDeside.Size = new System.Drawing.Size(98, 24);
            this.btnDeside.Text = "Вычислить";
            this.btnDeside.Click += new System.EventHandler(this.btnDeside_Click);
            // 
            // btnCancel
            // 
            this.btnCancel.Name = "btnCancel";
            this.btnCancel.Size = new System.Drawing.Size(76, 24);
            this.btnCancel.Text = "Отмена";
            this.btnCancel.Click += new System.EventHandler(this.btnCancel_Click);
            // 
            // frmAdd
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(511, 342);
            this.Controls.Add(this.txt);
            this.Controls.Add(this.spn1);
            this.Controls.Add(this.cmbOtvet);
            this.Controls.Add(this.cmbIspol);
            this.Controls.Add(this.cmbTarif);
            this.Controls.Add(this.cmbYsluga);
            this.Controls.Add(this.cmbAdress);
            this.Controls.Add(this.lblSum);
            this.Controls.Add(this.lblOtvet);
            this.Controls.Add(this.lblInspol);
            this.Controls.Add(this.lblRazmer);
            this.Controls.Add(this.lblTarif);
            this.Controls.Add(this.lblYsluga);
            this.Controls.Add(this.lblAdress);
            this.Controls.Add(this.menuStrip1);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "frmAdd";
            this.Text = "Добавить заказ";
            this.Load += new System.EventHandler(this.frmAdd_Load);
            ((System.ComponentModel.ISupportInitialize)(this.spn1)).EndInit();
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblAdress;
        private System.Windows.Forms.Label lblYsluga;
        private System.Windows.Forms.Label lblTarif;
        private System.Windows.Forms.Label lblRazmer;
        private System.Windows.Forms.Label lblInspol;
        private System.Windows.Forms.Label lblOtvet;
        private System.Windows.Forms.Label lblSum;
        private System.Windows.Forms.ComboBox cmbAdress;
        private System.Windows.Forms.ComboBox cmbYsluga;
        private System.Windows.Forms.ComboBox cmbTarif;
        private System.Windows.Forms.NumericUpDown spn1;
        private System.Windows.Forms.ComboBox cmbIspol;
        private System.Windows.Forms.ComboBox cmbOtvet;
        private System.Windows.Forms.TextBox txt;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem btnAddForm;
        private System.Windows.Forms.ToolStripMenuItem btnDeside;
        private System.Windows.Forms.ToolStripMenuItem btnCancel;
    }
}