package vistas;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
public class GenerarCotizacion1 extends javax.swing.JFrame {
	private JLabel lblTipoDoc;
	private JTextField txtNroDoc;
	private JButton btnCancelar;
	private JTable tableClientes;
	private JButton btnBuscar;
	private JButton btnNuevoCliente;
	private JButton btnAceptar;
	private JLabel lblNroDoc;
	private JComboBox cmbTipoDoc;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GenerarCotizacion1 inst = new GenerarCotizacion1();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public GenerarCotizacion1() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Generar Cotizacion - Buscar Cliente");
			{
				lblTipoDoc = new JLabel();
				lblTipoDoc.setText("Tipo de Documento");
			}
			{
				TableModel tableClientesModel = 
					new DefaultTableModel(
							new String[][] { { "Roberto", "Two" }, { "Carlos", "Four" } },
							new String[] { "Nombre", "Apellido" });
				tableClientes = new JTable();
				tableClientes.setModel(tableClientesModel);
			}
			{
				btnAceptar = new JButton();
				btnAceptar.setText("Seleccionar");
			}
			{
				btnCancelar = new JButton();
				btnCancelar.setText("Cancelar");
			}
			{
				btnNuevoCliente = new JButton();
				btnNuevoCliente.setText("Crear Cliente");
				btnNuevoCliente.setBackground(new java.awt.Color(255,255,255));
			}
			{
				btnBuscar = new JButton();
				btnBuscar.setText("Buscar");
				btnBuscar.setBackground(new java.awt.Color(255,255,255));
			}
			{
				ComboBoxModel cmbTipoDocModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				cmbTipoDoc = new JComboBox();
				cmbTipoDoc.setModel(cmbTipoDocModel);
			}
			{
				lblNroDoc = new JLabel();
				lblNroDoc.setText("Numero de Documento");
			}
			{
				txtNroDoc = new JTextField();
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(cmbTipoDoc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblTipoDoc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(txtNroDoc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNroDoc, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
											.addComponent(btnNuevoCliente, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(btnBuscar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(45)
											.addComponent(tableClientes, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
											.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
													.addComponent(btnAceptar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(btnCancelar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
													.addContainerGap(24, 24));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup()
							.addGroup(thisLayout.createSequentialGroup()
									.addGroup(thisLayout.createParallelGroup()
											.addComponent(lblNroDoc, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblTipoDoc, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
											.addGap(30)
											.addGroup(thisLayout.createParallelGroup()
													.addGroup(thisLayout.createSequentialGroup()
															.addGroup(thisLayout.createParallelGroup()
																	.addComponent(btnNuevoCliente, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
																	.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																			.addGap(0, 22, Short.MAX_VALUE)
																			.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
																			.addGap(11)))
																			.addGroup(thisLayout.createParallelGroup()
																					.addComponent(btnAceptar, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
																					.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
																							.addPreferredGap(btnAceptar, btnBuscar, LayoutStyle.ComponentPlacement.INDENT)
																							.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))))
																							.addComponent(txtNroDoc, GroupLayout.Alignment.LEADING, 0, 234, Short.MAX_VALUE)
																							.addComponent(cmbTipoDoc, GroupLayout.Alignment.LEADING, 0, 234, Short.MAX_VALUE)))
																							.addComponent(tableClientes, GroupLayout.Alignment.LEADING, 0, 424, Short.MAX_VALUE))
																							.addContainerGap());
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
