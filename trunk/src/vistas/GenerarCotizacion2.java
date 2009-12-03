package vistas;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;


/**
 * This code was edited or generated using CloudGarden's Jigloo
 * SWT/Swing GUI Builder, which is free for non-commercial
 * use. If Jigloo is being used commercially (ie, by a corporation,
 * company or business for any purpose whatever) then you
 * should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details.
 * Use of Jigloo implies acceptance of these licensing terms.
 * A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
 * THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
 * LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class GenerarCotizacion2 extends javax.swing.JFrame {
	private JSeparator separatorOrigen;
	private JSeparator separatorDestino;
	private JLabel lblPais;
	private JLabel lblCiudad;
	private JLabel lblFechaS;
	private JComboBox cmbCamiones;
	private JLabel lblCamion;
	private JTextField txtKmViaje;
	private JLabel lblDistanciaV;
	private JLabel jLabel4;
	private JLabel jLabel3;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JTextField txtDireccion2;
	private JTextField txtProvincia2;
	private JTextField txtPais2;
	private JScrollPane scrollMercaderia;
	private JScrollBar scrollMerca;
	private JTextArea jTextArea1;
	private JScrollPane scrollDescripcion;
	private JButton btnAgregarCA;
	private JList listCostoA;
	private JList listaCostoA;
	private JPanel panelCA;
	private JSeparator separatorCostoA;
	private JButton btnSiguiente;
	private JLabel jLabel5;
	private JLabel lblTotalKm;
	private JButton btnLimpiar;
	private JButton btnAgregar;
	private JButton btnInfoCamion;
	private JLabel lblDescripcion;
	private JTextArea txtaDescripcion;
	private JScrollPane scrollPaneVC;
	private JList listaVC;
	private JPanel panelVC;
	private JSeparator separatorVC;
	private JLabel lblFechaL;
	private JFormattedTextField txtfFechaL;
	private JFormattedTextField txtfFechaS;
	private JTextField txtCiudad2;
	private JPanel panelDestino;
	private JTextField txtDireccion;
	private JLabel lblDireccion;
	private JTextField txtCiudad;
	private JTextField txtPais;
	private JTextField txtProvincia;
	private JLabel lblProvincia;
	private JPanel panelOrigen;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GenerarCotizacion2 inst = new GenerarCotizacion2();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public GenerarCotizacion2() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Generar Cotizacion - Agregar  Viajes");
			{
				separatorOrigen = new JSeparator();
				GroupLayout separatorOrigenLayout = new GroupLayout(separatorOrigen);
				separatorOrigen.setLayout(separatorOrigenLayout);
				separatorOrigen.setBorder(BorderFactory.createTitledBorder("ORIGEN"));
				separatorOrigen.setSize(360, 200);
				{
					panelOrigen = new JPanel();
					GroupLayout panelOrigenLayout = new GroupLayout(panelOrigen);
					panelOrigen.setLayout(panelOrigenLayout);
					{
						lblProvincia = new JLabel();
						lblProvincia.setText("Provincia");
					}
					{
						txtProvincia = new JTextField();
					}
					{
						lblPais = new JLabel();
						lblPais.setText("Pais");
					}
					{
						txtPais = new JTextField();
					}
					{
						lblCiudad = new JLabel();
						lblCiudad.setText("Ciudad");
					}
					{
						txtCiudad = new JTextField();
					}
					{
						lblDireccion = new JLabel();
						lblDireccion.setText("Direccion");
					}
					{
						txtDireccion = new JTextField();
					}
					panelOrigenLayout.setHorizontalGroup(panelOrigenLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(panelOrigenLayout.createParallelGroup()
									.addComponent(lblProvincia, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addGroup(GroupLayout.Alignment.LEADING, panelOrigenLayout.createSequentialGroup()
											.addComponent(lblPais, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
											.addGap(13))
											.addComponent(lblCiudad, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
											.addGroup(GroupLayout.Alignment.LEADING, panelOrigenLayout.createSequentialGroup()
													.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
													.addGap(13)))
													.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
													.addGroup(panelOrigenLayout.createParallelGroup()
															.addGroup(panelOrigenLayout.createSequentialGroup()
																	.addComponent(txtProvincia, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
																	.addGroup(panelOrigenLayout.createSequentialGroup()
																			.addComponent(txtPais, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
																			.addGroup(panelOrigenLayout.createSequentialGroup()
																					.addComponent(txtCiudad, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
																					.addGroup(panelOrigenLayout.createSequentialGroup()
																							.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)))
																							.addContainerGap(19, Short.MAX_VALUE));
					panelOrigenLayout.setVerticalGroup(panelOrigenLayout.createSequentialGroup()
							.addGroup(panelOrigenLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(txtProvincia, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblProvincia, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(panelOrigenLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(txtPais, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblPais, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(panelOrigenLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(txtCiudad, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblCiudad, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
													.addGroup(panelOrigenLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
															.addComponent(lblDireccion, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
															.addComponent(txtDireccion, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
															.addContainerGap(132, 132));
				}
				separatorOrigenLayout.setHorizontalGroup(separatorOrigenLayout.createSequentialGroup()
						.addComponent(panelOrigen, 0, 350, Short.MAX_VALUE));
				separatorOrigenLayout.setVerticalGroup(separatorOrigenLayout.createSequentialGroup()
						.addComponent(panelOrigen, 0, 234, Short.MAX_VALUE));
			}
			{
				separatorDestino = new JSeparator();
				separatorDestino.setSize(360, 269);
				separatorDestino.setBorder(BorderFactory.createTitledBorder(null, "DESTINO", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION));
				{
					panelDestino = new JPanel();
					GroupLayout panelDestinoLayout = new GroupLayout(panelDestino);
					panelDestino.setLayout(panelDestinoLayout);
					separatorDestino.add(panelDestino);
					panelDestino.setBounds(5, 20, 338, 134);
					{
						txtCiudad2 = new JTextField();
					}
					{
						txtPais2 = new JTextField();
					}
					{
						txtProvincia2 = new JTextField();
					}
					{
						txtDireccion2 = new JTextField();
					}
					{
						jLabel1 = new JLabel();
						jLabel1.setText("Direccion");
					}
					{
						jLabel2 = new JLabel();
						jLabel2.setText("Ciudad");
					}
					{
						jLabel3 = new JLabel();
						jLabel3.setText("Pais");
					}
					{
						jLabel4 = new JLabel();
						jLabel4.setText("Provincia");
					}
					panelDestinoLayout.setHorizontalGroup(panelDestinoLayout.createSequentialGroup()
							.addGap(8)
							.addGroup(panelDestinoLayout.createParallelGroup()
									.addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
									.addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
									.addGap(12)
									.addGroup(panelDestinoLayout.createParallelGroup()
											.addGroup(panelDestinoLayout.createSequentialGroup()
													.addComponent(txtDireccion2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
													.addGap(0, 0, Short.MAX_VALUE))
													.addGroup(panelDestinoLayout.createSequentialGroup()
															.addComponent(txtProvincia2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
															.addGap(0, 0, Short.MAX_VALUE))
															.addGroup(panelDestinoLayout.createSequentialGroup()
																	.addComponent(txtPais2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
																	.addGap(0, 0, Short.MAX_VALUE))
																	.addGroup(GroupLayout.Alignment.LEADING, panelDestinoLayout.createSequentialGroup()
																			.addGap(0, 0, Short.MAX_VALUE)
																			.addComponent(txtCiudad2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)))
																			.addContainerGap());
					panelDestinoLayout.setVerticalGroup(panelDestinoLayout.createSequentialGroup()
							.addGap(7)
							.addGroup(panelDestinoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(txtProvincia2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
									.addComponent(jLabel4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(panelDestinoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(txtPais2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
											.addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(panelDestinoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(txtCiudad2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
													.addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
													.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
													.addGroup(panelDestinoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
															.addComponent(txtDireccion2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
															.addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
															.addContainerGap(21, 21));
				}
			}
			{
				lblFechaL = new JLabel();
				lblFechaL.setText("Fecha Llegada");
			}
			{
				separatorVC = new JSeparator();
				separatorVC.setBorder(BorderFactory.createTitledBorder(null, "VIAJES COTIZADOS", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION));
				{
					panelVC = new JPanel();
					GroupLayout panelVCLayout = new GroupLayout(panelVC);
					panelVC.setLayout(panelVCLayout);
					separatorVC.add(panelVC);
					panelVC.setBounds(5, 20, 710, 127);
					{
						ListModel listaVCModel = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
						listaVC = new JList();
						listaVC.setModel(listaVCModel);
						{
							scrollPaneVC = new JScrollPane();
							listaVC.add(scrollPaneVC);
							scrollPaneVC.setBounds(609, 113, 10, 10);
							scrollPaneVC.getVerticalScrollBar().setVisible(true);
						}
					}
					{
						lblTotalKm = new JLabel();
						lblTotalKm.setText("Total Kilometros Cotizados:");
					}
					{
						jLabel5 = new JLabel();
						jLabel5.setText("<>");
					}
					panelVCLayout.setHorizontalGroup(panelVCLayout.createSequentialGroup()
							.addContainerGap(20, 20)
							.addGroup(panelVCLayout.createParallelGroup()
									.addGroup(panelVCLayout.createSequentialGroup()
											.addComponent(listaVC, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE))
											.addGroup(GroupLayout.Alignment.LEADING, panelVCLayout.createSequentialGroup()
													.addGap(437)
													.addComponent(lblTotalKm, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
													.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
													.addContainerGap(20, Short.MAX_VALUE));
					panelVCLayout.setVerticalGroup(panelVCLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(listaVC, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(panelVCLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(lblTotalKm, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(jLabel5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(6));
				}
			}
			{
				scrollMercaderia = new JScrollPane();
				{
					jTextArea1 = new JTextArea();
					scrollMercaderia.setViewportView(jTextArea1);
					{
						scrollMerca = new JScrollBar();
						jTextArea1.add(scrollMerca);
						scrollMerca.setPreferredSize(new java.awt.Dimension(13, 140));
					}
				}
			}
			{
				lblDescripcion = new JLabel();
				lblDescripcion.setText("Descripcion Mercaderia");
			}
			{
				txtaDescripcion = new JTextArea();
				txtaDescripcion.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				{
					scrollDescripcion = new JScrollPane();
					txtaDescripcion.add(scrollDescripcion);
				}
			}
			{
				btnInfoCamion = new JButton();
				btnInfoCamion.setText("Ver Camion");
				btnInfoCamion.setBackground(new java.awt.Color(255,255,255));
			}
			{
				btnAgregar = new JButton();
				btnAgregar.setText("Agregar Viaje");
				btnAgregar.setBackground(new java.awt.Color(255,255,255));
			}
			{
				btnLimpiar = new JButton();
				btnLimpiar.setText("Limpiar");
				btnLimpiar.setBackground(new java.awt.Color(255,255,255));
			}
			{
				btnSiguiente = new JButton();
				btnSiguiente.setText("Finalizar");
			}
			{
				ListModel listaCostoAModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				listaCostoA = new JList();
				listaCostoA.setModel(listaCostoAModel);
			}
			{
				separatorCostoA = new JSeparator();
				GroupLayout separatorCostoALayout = new GroupLayout(separatorCostoA);
				separatorCostoA.setLayout(separatorCostoALayout);
				separatorCostoA.setBorder(BorderFactory.createTitledBorder("COSTOS ADICIONALES"));
				{
					panelCA = new JPanel();
					GroupLayout panelCALayout = new GroupLayout(panelCA);
					panelCA.setLayout(panelCALayout);
					panelCA.setBounds(125, 120, 10, 10);
					{
						ListModel listCostoAModel = 
							new DefaultComboBoxModel(
									new String[] { "Item One", "Item Two" });
						listCostoA = new JList();
						listCostoA.setModel(listCostoAModel);
					}
					{
						btnAgregarCA = new JButton();
						btnAgregarCA.setText("Agregar Costo Adicional");
						btnAgregarCA.setBackground(new java.awt.Color(255,255,255));
					}
					panelCALayout.setHorizontalGroup(panelCALayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(panelCALayout.createParallelGroup()
									.addComponent(btnAgregarCA, GroupLayout.Alignment.LEADING, 0, 274, Short.MAX_VALUE)
									.addComponent(listCostoA, GroupLayout.Alignment.LEADING, 0, 274, Short.MAX_VALUE))
									.addContainerGap());
					panelCALayout.setVerticalGroup(panelCALayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(listCostoA, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(btnAgregarCA, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
				}
				separatorCostoALayout.setHorizontalGroup(separatorCostoALayout.createSequentialGroup()
						.addComponent(panelCA, 0, 298, Short.MAX_VALUE));
				separatorCostoALayout.setVerticalGroup(separatorCostoALayout.createSequentialGroup()
						.addComponent(panelCA, 0, 116, Short.MAX_VALUE));
			}
			{
				lblDistanciaV = new JLabel();
				lblDistanciaV.setText("Distancia del Viaje (KM)");
			}
			{
				txtKmViaje = new JTextField();
			}
			{
				lblCamion = new JLabel();
				lblCamion.setText("Camion a Utilizar");
			}
			{
				ComboBoxModel cmbCamionesModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				cmbCamiones = new JComboBox();
				cmbCamiones.setModel(cmbCamionesModel);
			}
			{
				lblFechaS = new JLabel();
				lblFechaS.setText("Fecha Salida");
			}
			{
				txtfFechaS = new JFormattedTextField();
			}
			{
				txtfFechaL = new JFormattedTextField();
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addComponent(listaCostoA, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(separatorDestino, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
							.addComponent(separatorOrigen, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(txtfFechaL, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblFechaL, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtfFechaS, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblFechaS, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(cmbCamiones, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblCamion, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtKmViaje, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblDistanciaV, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
											.addComponent(btnInfoCamion, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
											.addGroup(thisLayout.createParallelGroup()
													.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
															.addComponent(lblDescripcion, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
															.addGap(126))
															.addComponent(separatorCostoA, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
															.addComponent(scrollMercaderia, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
															.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
															.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
																	.addComponent(btnAgregar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addComponent(btnLimpiar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
																	.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
																	.addComponent(separatorVC, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
																	.addGap(19)
																	.addComponent(btnSiguiente, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addContainerGap(25, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addGroup(thisLayout.createParallelGroup()
							.addGroup(thisLayout.createSequentialGroup()
									.addGroup(thisLayout.createParallelGroup()
											.addComponent(separatorOrigen, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
											.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
													.addComponent(listaCostoA, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
													.addGap(12)
													.addGroup(thisLayout.createParallelGroup()
															.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																	.addComponent(lblDescripcion, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
																	.addGap(11))
																	.addComponent(lblDistanciaV, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
																	.addComponent(lblFechaS, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
																	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																	.addGroup(thisLayout.createParallelGroup()
																			.addComponent(scrollMercaderia, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
																			.addComponent(txtKmViaje, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
																			.addComponent(txtfFechaS, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))))
																			.addGap(16)
																			.addGroup(thisLayout.createParallelGroup()
																					.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																							.addComponent(separatorDestino, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
																							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
																							.addGroup(thisLayout.createSequentialGroup()
																									.addPreferredGap(separatorDestino, separatorCostoA, LayoutStyle.ComponentPlacement.INDENT)
																									.addGroup(thisLayout.createParallelGroup()
																											.addComponent(separatorCostoA, GroupLayout.Alignment.LEADING, 0, 340, Short.MAX_VALUE)
																											.addGroup(thisLayout.createSequentialGroup()
																													.addGroup(thisLayout.createParallelGroup()
																															.addComponent(lblCamion, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
																															.addComponent(lblFechaL, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
																															.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
																															.addGroup(thisLayout.createParallelGroup()
																																	.addGroup(thisLayout.createSequentialGroup()
																																			.addComponent(cmbCamiones, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE))
																																			.addGroup(thisLayout.createSequentialGroup()
																																					.addComponent(txtfFechaL, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)))
																																					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
																																					.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																							.addGap(67)
																																							.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
																																							.addGap(19)
																																							.addGroup(thisLayout.createParallelGroup()
																																									.addGroup(thisLayout.createSequentialGroup()
																																											.addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
																																											.addGap(0, 0, Short.MAX_VALUE))
																																											.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																													.addComponent(btnInfoCamion, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
																																													.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE))
																																													.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																															.addGap(39)
																																															.addComponent(btnSiguiente, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
																																															.addGap(0, 0, Short.MAX_VALUE)))
																																															.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))))))
																																															.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																																																	.addComponent(separatorVC, GroupLayout.PREFERRED_SIZE, 721, GroupLayout.PREFERRED_SIZE)
																																																	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)))
																																																	.addContainerGap());
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
