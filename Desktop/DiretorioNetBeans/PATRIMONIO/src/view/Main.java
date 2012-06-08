/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main.java
 *
 * Created on 18/05/2012, 10:48:21
 */
package view;

import dados.ConectaBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Main extends javax.swing.JFrame {


    
    
    public ArrayList<Integer> idsItensSelecionados = new ArrayList<Integer>();
    public ArrayList<Integer> idsItensSelecEdicao = new ArrayList<Integer>();
    public ArrayList<Integer> idsItensSelecExclusao = new ArrayList<Integer>();
    
    
    public boolean sessao = false;
     
     
    
    public Main() {
        initComponents();
        
        painelTabulado.setVisible(false);
        //labelUsuarioLogado.setVisible(false);
        panelDadosUsuarioLogado.setVisible(false);
        
        
        
        
        //insere os dados no bomboBox campus na Tela interna login
        setDadosComboBoxCampus();
      
        
        
/*        
        tela_Item_CadastroLote.setVisible(false);
        tela_Item_Edicao.setVisible(false);
        tela_Item_Lista.setVisible(true);
        aba_ITEM.revalidate();  
        corpo_CRUD_Item.revalidate();
*/        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        painelTabulado = new javax.swing.JTabbedPane();
        aba_ITEM = new javax.swing.JPanel();
        botao_Item_CadastroLote = new javax.swing.JButton();
        botao_Item_CadastroUnico = new javax.swing.JButton();
        botao_Item_EdicaoLote = new javax.swing.JButton();
        botao_Item_ExclusaoLote = new javax.swing.JButton();
        botao_Item_Lista = new javax.swing.JButton();
        corpo_CRUD_Item = new javax.swing.JPanel();
        tela_Item_Lista = new view.Tela_Item_Lista();
        tela_Item_CadastroLote = new view.Tela_Item_CadastroLote();
        tela_Item_Edicao = new view.Tela_Item_Edicao();
        aba_FORNECEDOR = new javax.swing.JPanel();
        aba_RESPONSAVEL = new javax.swing.JPanel();
        aba_USUARIO = new javax.swing.JPanel();
        aba_LOCALIZACAO = new javax.swing.JPanel();
        aba_CONFIGURACAO = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        painelLogin = new javax.swing.JPanel();
        botaoAcessarSistema = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campo_Login_Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboBox_Login_Campus = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        campo_Login_Senha = new javax.swing.JPasswordField();
        panelDadosUsuarioLogado = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelUsuarioLogado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGPU - Sistema de Gerenciamento de Patrimônio da Unipampa");

        aba_ITEM.setAutoscrolls(true);
        aba_ITEM.setPreferredSize(new java.awt.Dimension(1198, 2100));

        botao_Item_CadastroLote.setText("Cadastro Lote");
        botao_Item_CadastroLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Item_CadastroLoteActionPerformed(evt);
            }
        });

        botao_Item_CadastroUnico.setText("Cadastro Único");

        botao_Item_EdicaoLote.setText("Edição Lote");
        botao_Item_EdicaoLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Item_EdicaoLoteActionPerformed(evt);
            }
        });

        botao_Item_ExclusaoLote.setText("Exclusão Lote");
        botao_Item_ExclusaoLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Item_ExclusaoLoteActionPerformed(evt);
            }
        });

        botao_Item_Lista.setText("Lista");
        botao_Item_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Item_ListaActionPerformed(evt);
            }
        });

        corpo_CRUD_Item.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        corpo_CRUD_Item.setAutoscrolls(true);

        javax.swing.GroupLayout corpo_CRUD_ItemLayout = new javax.swing.GroupLayout(corpo_CRUD_Item);
        corpo_CRUD_Item.setLayout(corpo_CRUD_ItemLayout);
        corpo_CRUD_ItemLayout.setHorizontalGroup(
            corpo_CRUD_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpo_CRUD_ItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(corpo_CRUD_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tela_Item_CadastroLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tela_Item_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tela_Item_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        corpo_CRUD_ItemLayout.setVerticalGroup(
            corpo_CRUD_ItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpo_CRUD_ItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela_Item_CadastroLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Item_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Item_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout aba_ITEMLayout = new javax.swing.GroupLayout(aba_ITEM);
        aba_ITEM.setLayout(aba_ITEMLayout);
        aba_ITEMLayout.setHorizontalGroup(
            aba_ITEMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_ITEMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_ITEMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao_Item_Lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_Item_ExclusaoLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_Item_EdicaoLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_Item_CadastroLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_Item_CadastroUnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(corpo_CRUD_Item, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
                .addContainerGap())
        );
        aba_ITEMLayout.setVerticalGroup(
            aba_ITEMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_ITEMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_ITEMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corpo_CRUD_Item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(aba_ITEMLayout.createSequentialGroup()
                        .addComponent(botao_Item_Lista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Item_CadastroLote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Item_CadastroUnico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Item_EdicaoLote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Item_ExclusaoLote)))
                .addGap(1786, 1786, 1786))
        );

        painelTabulado.addTab("     ITEM     ", aba_ITEM);

        javax.swing.GroupLayout aba_FORNECEDORLayout = new javax.swing.GroupLayout(aba_FORNECEDOR);
        aba_FORNECEDOR.setLayout(aba_FORNECEDORLayout);
        aba_FORNECEDORLayout.setHorizontalGroup(
            aba_FORNECEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        aba_FORNECEDORLayout.setVerticalGroup(
            aba_FORNECEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2231, Short.MAX_VALUE)
        );

        painelTabulado.addTab("FORNECEDOR", aba_FORNECEDOR);

        javax.swing.GroupLayout aba_RESPONSAVELLayout = new javax.swing.GroupLayout(aba_RESPONSAVEL);
        aba_RESPONSAVEL.setLayout(aba_RESPONSAVELLayout);
        aba_RESPONSAVELLayout.setHorizontalGroup(
            aba_RESPONSAVELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        aba_RESPONSAVELLayout.setVerticalGroup(
            aba_RESPONSAVELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2231, Short.MAX_VALUE)
        );

        painelTabulado.addTab("RESPONSÁVEL", aba_RESPONSAVEL);

        javax.swing.GroupLayout aba_USUARIOLayout = new javax.swing.GroupLayout(aba_USUARIO);
        aba_USUARIO.setLayout(aba_USUARIOLayout);
        aba_USUARIOLayout.setHorizontalGroup(
            aba_USUARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        aba_USUARIOLayout.setVerticalGroup(
            aba_USUARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2231, Short.MAX_VALUE)
        );

        painelTabulado.addTab("USUÁRIO", aba_USUARIO);

        javax.swing.GroupLayout aba_LOCALIZACAOLayout = new javax.swing.GroupLayout(aba_LOCALIZACAO);
        aba_LOCALIZACAO.setLayout(aba_LOCALIZACAOLayout);
        aba_LOCALIZACAOLayout.setHorizontalGroup(
            aba_LOCALIZACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        aba_LOCALIZACAOLayout.setVerticalGroup(
            aba_LOCALIZACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2231, Short.MAX_VALUE)
        );

        painelTabulado.addTab("LOCALIZAÇÃO", aba_LOCALIZACAO);

        javax.swing.GroupLayout aba_CONFIGURACAOLayout = new javax.swing.GroupLayout(aba_CONFIGURACAO);
        aba_CONFIGURACAO.setLayout(aba_CONFIGURACAOLayout);
        aba_CONFIGURACAOLayout.setHorizontalGroup(
            aba_CONFIGURACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        aba_CONFIGURACAOLayout.setVerticalGroup(
            aba_CONFIGURACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2231, Short.MAX_VALUE)
        );

        painelTabulado.addTab("CONFIGURAÇÃO", aba_CONFIGURACAO);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1198, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2231, Short.MAX_VALUE)
        );

        painelTabulado.addTab("TERMO RESPONSABILIDADE", jPanel1);

        painelLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoAcessarSistema.setText("Acessar Sistema");
        botaoAcessarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAcessarSistemaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("Tela Login");

        campo_Login_Usuario.setText("admin");
        campo_Login_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_Login_UsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Usuário:");

        jLabel4.setText("Senha:");

        comboBox_Login_Campus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_Login_CampusActionPerformed(evt);
            }
        });

        jLabel5.setText("Campus:");

        jPasswordField1.setText("jPasswordField1");

        campo_Login_Senha.setText("admin");

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_Login_Senha, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(comboBox_Login_Campus, 0, 147, Short.MAX_VALUE)
                            .addComponent(campo_Login_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(botaoAcessarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)))
                .addGap(573, 573, 573))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_Login_Campus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_Login_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_Login_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(botaoAcessarSistema)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelDadosUsuarioLogado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Usuário logado:");

        labelUsuarioLogado.setText("aquiVaiUsuárioLogado");

        javax.swing.GroupLayout panelDadosUsuarioLogadoLayout = new javax.swing.GroupLayout(panelDadosUsuarioLogado);
        panelDadosUsuarioLogado.setLayout(panelDadosUsuarioLogadoLayout);
        panelDadosUsuarioLogadoLayout.setHorizontalGroup(
            panelDadosUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosUsuarioLogadoLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadosUsuarioLogadoLayout.setVerticalGroup(
            panelDadosUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(labelUsuarioLogado))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDadosUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTabulado, javax.swing.GroupLayout.DEFAULT_SIZE, 1203, Short.MAX_VALUE)
                    .addComponent(painelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDadosUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTabulado, javax.swing.GroupLayout.PREFERRED_SIZE, 2259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1256)/2, (screenSize.height-788)/2, 1256, 788);
    }// </editor-fold>//GEN-END:initComponents

 /*   
    public void setSessao(boolean sessao){
    
        
        

    
        if( sessao ){
                painelTabulado.setVisible(true);
        
                tela_Item_CadastroLote.setVisible(false);
                tela_Item_Lista.setVisible(false);
                tela_Item_Lista.setVisible(true);
                aba_ITEM.revalidate();  
                corpo_CRUD_Item.revalidate();

        }else{
        
            painelTabulado.setVisible(false);
        
        }
    }
 */
    
    
    //insere dados do usuário logado no sistema
    public void setLabelUsuarioLogado(){
        
        labelUsuarioLogado.setVisible(true);
        labelUsuarioLogado.setText( campo_Login_Usuario.getText().toString() );
    
    }
    
    
    //insere dados na comboBox campus que está na tela de login
    public void setDadosComboBoxCampus(){
       
        ConectaBD conectaDB = new ConectaBD();

        try {        
        conectaDB.select("*", "campus","" );
        
        int totalResultados = conectaDB.totalResultados( conectaDB.getResultSet());
        
        //inicializa um array de strins de dados vindos do banco
        String[] dados =  new String[ totalResultados ];
        

                int i = 0;         
                while( conectaDB.getResultSet().next() ){
                    //flag = true;
                    //JOptionPane.showMessageDialog(null, " VALOR RETORNO CONSULTA: "+conectaDB.resultSet.getString("login")+" | "+conectaDB.resultSet.getString("senha"));    
                    
                    dados[i] = conectaDB.resultSet.getString("campus").toString();
                    i++;        
               }
                
                //comboBox_Login_Campus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));    
                
                //insere os dados no comboBox
                comboBox_Login_Campus.setModel(new javax.swing.DefaultComboBoxModel( dados ));    
                
            } catch (SQLException ex) {

                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
private void botao_Item_CadastroLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Item_CadastroLoteActionPerformed

        //preenche dados dos comboBoxs
        tela_Item_CadastroLote.preencheDadosFormulario();
        
        
        //esconde o formulário interno de cadastro de fornecedor
        tela_Item_CadastroLote.panelCadInternoFornecedor.setVisible(false);
        
    
        tela_Item_CadastroLote.setVisible(true);
        tela_Item_Lista.setVisible(false);
        tela_Item_Lista.setVisible(false);

        tela_Item_CadastroLote.revalidate();
        tela_Item_Lista.revalidate();
        tela_Item_Lista.revalidate();
        aba_ITEM.revalidate();    
        corpo_CRUD_Item.revalidate();
    
}//GEN-LAST:event_botao_Item_CadastroLoteActionPerformed

private void botao_Item_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Item_ListaActionPerformed

        //habilita o botão "excluir em lote"
        botao_Item_ExclusaoLote.setEnabled(true);
    
    
        tela_Item_Lista.preeecherTabelaListaItens();
    
    
        tela_Item_CadastroLote.setVisible(false);
        tela_Item_Edicao.setVisible(false);
        tela_Item_Lista.setVisible(true);

        tela_Item_CadastroLote.revalidate();
        tela_Item_Edicao.revalidate();
        tela_Item_Lista.revalidate();
        aba_ITEM.revalidate();     
        corpo_CRUD_Item.revalidate();
}//GEN-LAST:event_botao_Item_ListaActionPerformed

private void botao_Item_EdicaoLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Item_EdicaoLoteActionPerformed

    
        //desabilita o botão "excluir em lote"
        botao_Item_ExclusaoLote.setEnabled(false);
        
    
        tela_Item_CadastroLote.setVisible(false);
        tela_Item_Edicao.setVisible(true);
        tela_Item_Lista.setVisible(false);

        tela_Item_CadastroLote.revalidate();
        tela_Item_Edicao.revalidate();
        tela_Item_Lista.revalidate();
        aba_ITEM.revalidate();     
        corpo_CRUD_Item.revalidate();
        
        
        
        //cria um array somente com as linhas da tabela que foram selecionadas
        int[]  retorno = this.tela_Item_Lista.TabelaListaItens.getSelectedRows();
        
        //zera este array de dados para a próxima
        //idsItensSelecionados = new ArrayList<Integer>();                
        idsItensSelecEdicao = new ArrayList<Integer>();              
        
        //baseado em int[] retorno (que está logo acima) preenche o array com os dados 
        //somente das linhas selecionadas e somente da primeira coluna [?][0] que é 
        //onde está o registro patrimonial do BD, que de fato é a informação coletada
        for(int i = 0; i < retorno.length; i++){
           
            idsItensSelecEdicao.add(Integer.parseInt( this.tela_Item_Lista.TabelaListaItens.getValueAt( retorno[i] , 0).toString() ));
        }
        

        
        //preenche o atributo da classe Tela_Item_Edicao cuja qual será apresentada com os dados selecionados
        //tela_Item_Lista.setIdsItensSelecionados(idsItensSelecionados);
        tela_Item_Edicao.setIdsItensSelecionados(idsItensSelecEdicao);
        
        
        //chama o método da classe que vai ser instanciada (Tela_Item_Lista)
        tela_Item_Edicao.preeecheTabelaEditaItensLote();

        

        

    
}//GEN-LAST:event_botao_Item_EdicaoLoteActionPerformed

private void botao_Item_ExclusaoLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Item_ExclusaoLoteActionPerformed

    
            
        //cria um array somente com as linhas da tabela que foram selecionadas
        int[]  retorno = this.tela_Item_Lista.TabelaListaItens.getSelectedRows();
        
        //zera este array de dados para a próxima
        idsItensSelecExclusao = new ArrayList<Integer>();                
        
        //baseado em int[] retorno (que está logo acima) preenche o array com os dados 
        //somente das linhas selecionadas e somente da primeira coluna [?][0] que é 
        //onde está o registro patrimonial do BD, que de fato é a informação coletada
        for(int i = 0; i < retorno.length; i++){
           
            idsItensSelecExclusao.add(Integer.parseInt( this.tela_Item_Lista.TabelaListaItens.getValueAt( retorno[i] , 0).toString() ));
        }
    
     
     try{
         
             ConectaBD conectaDB = new ConectaBD();
             
             for( int i = 0; i < idsItensSelecExclusao.size(); i++){

                 //exclui a linha da tabela
                 conectaDB.delete("item", idsItensSelecExclusao.get( i ) );
                 
             }
             //atualiza a tabela gráfica em tempo real
             tela_Item_Lista.preeecherTabelaListaItens();
        
             JOptionPane.showMessageDialog(null, "Exclusão realizado com Sucesso!");             
             
     }catch(Exception erro){
        
            JOptionPane.showMessageDialog(null, "Erro, não foi possível excluir a linha selecionada, erro: "+erro);
     }
     
    
}//GEN-LAST:event_botao_Item_ExclusaoLoteActionPerformed

private void botaoAcessarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAcessarSistemaActionPerformed

    
     ConectaBD conectaDB = new ConectaBD();
             
     conectaDB.select("*", "usuario"," where login = '"+campo_Login_Usuario.getText().toString()+"' AND senha = '"+campo_Login_Senha.getText().toString()+"' limit 1" );
     boolean flag = false;
     try {
            
            while( conectaDB.getResultSet().next() ){
                flag = true;
                /*JOptionPane.showMessageDialog(null, " VALOR RETORNO CONSULTA: "+conectaDB.resultSet.getString("login")+
                        " | "+conectaDB.resultSet.getString("senha")+" | "+comboBox_Login_Campus.getSelectedItem().toString());       
                */
           }
        } catch (SQLException ex) {
            
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    if( flag ){
        
        
        painelTabulado.setVisible(true);
        
        tela_Item_CadastroLote.setVisible(false);
        
        panelDadosUsuarioLogado.setVisible(true);
        
        tela_Item_Edicao.setVisible(false);
        tela_Item_Lista.setVisible(true);
        aba_ITEM.revalidate();  
        corpo_CRUD_Item.revalidate();
        
          
        //insere dados do usuário logado no sistema
        setLabelUsuarioLogado();

        //JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");               
    }else{
    
        JOptionPane.showMessageDialog(null, "Erro, os dados informados estão incorretos, tente mais tarde.");               
    }
    
    

    
    
}//GEN-LAST:event_botaoAcessarSistemaActionPerformed

private void comboBox_Login_CampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_Login_CampusActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_comboBox_Login_CampusActionPerformed

private void campo_Login_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_Login_UsuarioActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_campo_Login_UsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aba_CONFIGURACAO;
    private javax.swing.JPanel aba_FORNECEDOR;
    private javax.swing.JPanel aba_ITEM;
    private javax.swing.JPanel aba_LOCALIZACAO;
    private javax.swing.JPanel aba_RESPONSAVEL;
    private javax.swing.JPanel aba_USUARIO;
    private javax.swing.JButton botaoAcessarSistema;
    private javax.swing.JButton botao_Item_CadastroLote;
    private javax.swing.JButton botao_Item_CadastroUnico;
    private javax.swing.JButton botao_Item_EdicaoLote;
    public javax.swing.JButton botao_Item_ExclusaoLote;
    private javax.swing.JButton botao_Item_Lista;
    private javax.swing.JPasswordField campo_Login_Senha;
    private javax.swing.JTextField campo_Login_Usuario;
    private javax.swing.JComboBox comboBox_Login_Campus;
    private javax.swing.JPanel corpo_CRUD_Item;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelUsuarioLogado;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JTabbedPane painelTabulado;
    private javax.swing.JPanel panelDadosUsuarioLogado;
    private view.Tela_Item_CadastroLote tela_Item_CadastroLote;
    private view.Tela_Item_Edicao tela_Item_Edicao;
    private view.Tela_Item_Lista tela_Item_Lista;
    // End of variables declaration//GEN-END:variables

    
    
    public ArrayList<Integer> getIdsItensSelecionados() {
        return idsItensSelecionados;
    }

    
    public void setIdsItensSelecionados(ArrayList<Integer> idsItensSelecionados) {
        this.idsItensSelecionados = idsItensSelecionados;
    }
    
    
    
}
