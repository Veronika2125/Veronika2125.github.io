/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package base;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.endpoint.TableServiceService;
import types.ListOfTable;
import types.Table;
/**
 *
 * @author Вероника
 */
public class Frame extends javax.swing.JFrame {
    
    public static Frame forma1 = new Frame();
    public static Frame forma3 = new Frame();
    public static Frame forma4 = new Frame();

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
    }
    
    static DefaultTableModel model = new DefaultTableModel();
    static TableServiceService tableService = null;
    static{
        tableService = new TableServiceService();
    }
    
    
    private void doVivod(ListOfTable lstTable){
        doClearTable();
        for(Table table: lstTable.getItem()){
            Object[] rowData = new Object[7];
            rowData[0] = table.getName();
            rowData[1] = table.getYsluga();
            rowData[2] = table.getTarif();
            rowData[3] = table.getRazmer();
            rowData[4] = table.getIspol();
            rowData[5] = table.getOtvet();
            rowData[6] = table.getPrice();
            model.addRow(rowData);
        }
    }
   
    
     private void doClearTable(){
        while (model.getRowCount()>0){
            model.removeRow(0);
        }   
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlg = new javax.swing.JDialog();
        lblAdress = new javax.swing.JLabel();
        lblYsluga = new javax.swing.JLabel();
        lblTarif = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblIspoln = new javax.swing.JLabel();
        lblOtvet = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbAdress = new javax.swing.JComboBox();
        cmbYsluga = new javax.swing.JComboBox();
        cmbTarif = new javax.swing.JComboBox();
        cmbIspol = new javax.swing.JComboBox();
        cmbOtvet = new javax.swing.JComboBox();
        spn1 = new javax.swing.JSpinner();
        txt = new javax.swing.JTextField();
        jtb2 = new javax.swing.JToolBar();
        btnAddForm = new javax.swing.JButton();
        spr2 = new javax.swing.JToolBar.Separator();
        AddDecide = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnExid1 = new javax.swing.JButton();
        btnGroup = new javax.swing.ButtonGroup();
        dlgZakaz = new javax.swing.JDialog();
        jtb = new javax.swing.JToolBar();
        btnAdd1 = new javax.swing.JButton();
        spr3 = new javax.swing.JToolBar.Separator();
        btnDelete = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnCancel1 = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        dlg.setTitle("Окно ввода");

        lblAdress.setText("Адрес дома");

        lblYsluga.setText("Услуга");

        lblTarif.setText("Вид тарифа");

        jLabel4.setText("Размер");

        lblIspoln.setText("Исполнитель");

        lblOtvet.setText("Ответственный");

        jLabel7.setText("Сумма");

        cmbAdress.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ул. Радужная, д. 15", "ул. Радужная, д. 16", "ул. Радужная, д. 16а", "ул. Радужная, д. 17", "ул. Радужная, д. 17а", " " }));
        cmbAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAdressActionPerformed(evt);
            }
        });

        cmbYsluga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Вывоз мусора", "Уборка двора", "Уборка подъезда", "Ремонт крыши", "Ремонт лифта", "Ремонт водопровода", "Ремонт газопровода", "Ремонт электропровода", " " }));
        cmbYsluga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYslugaActionPerformed(evt);
            }
        });

        cmbTarif.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "По количеству", "По площади" }));

        cmbIspol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ООО \"Молоток\"", "ООО \"Капля\"", "ООО \"Газ\"", "ООО \"Искра\"", "Дворник", "Уборщик", "Сварщик", "Строители", "Бухгалтер", "Бригадир" }));

        cmbOtvet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Иванов Юрий Михайлович - Председатель ТСЖ", "Петров Игорь Валерьевич - Член правления", "Петренко Светлана Геннадьевна - Член правления", "Добростина Анна Михайловна - Член правления" }));

        spn1.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(30.0f), Float.valueOf(10.0f), Float.valueOf(500.0f), Float.valueOf(2.0f)));

        txt.setEditable(false);
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });

        jtb2.setRollover(true);

        btnAddForm.setText("Добавить");
        btnAddForm.setFocusable(false);
        btnAddForm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddForm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFormActionPerformed(evt);
            }
        });
        jtb2.add(btnAddForm);
        jtb2.add(spr2);

        AddDecide.setText("Вычислить");
        AddDecide.setFocusable(false);
        AddDecide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddDecide.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddDecide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDecideActionPerformed(evt);
            }
        });
        jtb2.add(AddDecide);
        jtb2.add(jSeparator1);

        btnExid1.setText("Назад");
        btnExid1.setFocusable(false);
        btnExid1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExid1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExid1ActionPerformed(evt);
            }
        });
        jtb2.add(btnExid1);

        javax.swing.GroupLayout dlgLayout = new javax.swing.GroupLayout(dlg.getContentPane());
        dlg.getContentPane().setLayout(dlgLayout);
        dlgLayout.setHorizontalGroup(
            dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgLayout.createSequentialGroup()
                .addGroup(dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(dlgLayout.createSequentialGroup()
                                .addComponent(lblAdress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgLayout.createSequentialGroup()
                                .addComponent(lblYsluga)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbYsluga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgLayout.createSequentialGroup()
                                .addComponent(lblTarif)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbTarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgLayout.createSequentialGroup()
                                .addComponent(lblIspoln)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbIspol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgLayout.createSequentialGroup()
                                .addComponent(lblOtvet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(cmbOtvet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dlgLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(dlgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtb2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        dlgLayout.setVerticalGroup(
            dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jtb2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbYsluga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYsluga))
                .addGap(30, 30, 30)
                .addGroup(dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTarif))
                .addGap(37, 37, 37)
                .addGroup(dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addGroup(dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbIspol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIspoln))
                .addGap(35, 35, 35)
                .addGroup(dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOtvet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOtvet))
                .addGap(35, 35, 35)
                .addGroup(dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jtb.setRollover(true);

        btnAdd1.setText("Добавить");
        btnAdd1.setFocusable(false);
        btnAdd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        jtb.add(btnAdd1);
        jtb.add(spr3);

        btnDelete.setText("Удалить");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jtb.add(btnDelete);
        jtb.add(jSeparator2);

        btnCancel1.setText("Назад");
        btnCancel1.setFocusable(false);
        btnCancel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });
        jtb.add(btnCancel1);

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Адрес дома", "Услуга", "Вид тарифа", "Размер", "Исполнитель", "Ответственное лицо", "Сумма"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tbl);

        javax.swing.GroupLayout dlgZakazLayout = new javax.swing.GroupLayout(dlgZakaz.getContentPane());
        dlgZakaz.getContentPane().setLayout(dlgZakazLayout);
        dlgZakazLayout.setHorizontalGroup(
            dlgZakazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgZakazLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgZakazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgZakazLayout.createSequentialGroup()
                        .addComponent(jtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
                .addContainerGap())
        );
        dlgZakazLayout.setVerticalGroup(
            dlgZakazLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgZakazLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Меню");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("Заказы");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("Прайс-лист");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton3.setText("Адреса домов");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton6.setText("Члены комитета");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton7.setText("Выход");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFormActionPerformed
        dlg.setVisible(false);
        Table el;
            el= new Table();
            el.setName(cmbAdress.getSelectedItem().toString());
            el.setYsluga(cmbYsluga.getSelectedItem().toString());
            el.setTarif(cmbTarif.getSelectedItem().toString());
            el.setRazmer((float)spn1.getValue());
            el.setIspol(cmbIspol.getSelectedItem().toString());
            el.setOtvet(cmbOtvet.getSelectedItem().toString());
            el.setPrice(Float.parseFloat(txt.getText()));
    try {
            doVivod(tableService.getTableServicePort().setNewDogovor(el));
        }
   catch(Exception ex){
            ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                "Ошибка",
                JOptionPane.ERROR_MESSAGE);}     
    }//GEN-LAST:event_btnAddFormActionPerformed

    private void AddDecideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDecideActionPerformed
        float sum=0;
        if(cmbYsluga.getSelectedItem().toString()=="Вывоз мусора")  sum=(43*(float)spn1.getValue());
        if(cmbYsluga.getSelectedItem().toString()=="Уборка двора")  sum=(50*(float)spn1.getValue());
        if(cmbYsluga.getSelectedItem().toString()=="Уборка подъезда")  sum=(30*(float)spn1.getValue());
        if(cmbYsluga.getSelectedItem().toString()=="Ремонт крыши")  sum=(1100*(float)spn1.getValue());
        if(cmbYsluga.getSelectedItem().toString()=="Ремонт лифта")  sum=(90*(float)spn1.getValue());
        if(cmbYsluga.getSelectedItem().toString()=="Ремонт водопровода")  sum=(100*(float)spn1.getValue());
        if(cmbYsluga.getSelectedItem().toString()=="Ремонт газопровода")  sum=(100*(float)spn1.getValue());
        if(cmbYsluga.getSelectedItem().toString()=="Ремонт электропровода")  sum=(100*(float)spn1.getValue());
        txt.setText(Float.toString(sum));
    }//GEN-LAST:event_AddDecideActionPerformed

    private void cmbAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAdressActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void cmbYslugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYslugaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbYslugaActionPerformed

    private void btnExid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExid1ActionPerformed
         dlg.setVisible(false);       
    }//GEN-LAST:event_btnExid1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dlgZakaz.setSize(800, 350);
        dlgZakaz.setVisible(true);
        model = (DefaultTableModel)tbl.getModel(); 
        try {
            doVivod(tableService.getTableServicePort().getAllTovar());
        } catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                "Ошибка",
                JOptionPane.ERROR_MESSAGE);}    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
      dlg.setSize(537, 500);
      dlg.setVisible(true);
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
       dlgZakaz.setVisible(false);
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) tbl.getModel();
        if(tbl.getSelectedRowCount()==1){
            try {
                tableService.getTableServicePort().delDogovor(tbl.getSelectedRow());
            } catch(Exception ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Не удалось установить соединение с сервером:" + ex.getMessage() + ".",
                    "Ошибка",
                    JOptionPane.ERROR_MESSAGE);}
            
        tblModel.removeRow(tbl.getSelectedRow());}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
        Price.forma2.setVisible(true);
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.hide();
        PAdress.forma3.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.hide();
        Kom.forma4.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDecide;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAddForm;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExid1;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JComboBox cmbAdress;
    private javax.swing.JComboBox cmbIspol;
    private javax.swing.JComboBox cmbOtvet;
    private javax.swing.JComboBox cmbTarif;
    private javax.swing.JComboBox cmbYsluga;
    private javax.swing.JDialog dlg;
    private javax.swing.JDialog dlgZakaz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jtb;
    private javax.swing.JToolBar jtb2;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblIspoln;
    private javax.swing.JLabel lblOtvet;
    private javax.swing.JLabel lblTarif;
    private javax.swing.JLabel lblYsluga;
    private javax.swing.JSpinner spn1;
    private javax.swing.JToolBar.Separator spr2;
    private javax.swing.JToolBar.Separator spr3;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables


}