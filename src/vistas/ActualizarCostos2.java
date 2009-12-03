package vistas;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListModel;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class ActualizarCostos2 extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel lblBuscar;
	private JTextField txtCostoBuscar;
	private JSeparator jsep1;
	private JLabel lblNombre1;
	private JTextField txtValor1;
	private JTextField txtNombre2;
	private JTextField txtPrecioKm;
	private JTextField txtUnitario;
	private JTextField txtCantidad;
	private JButton btnFinalizar;
	private JButton btnCancelar3;
	private JButton btnCancelar2;
	private JSeparator jsep4;
	private JButton btnGuardar2;
	private JTextField txtDuracion;
	private JLabel lblPrecioKm;
	private JLabel lblUnitario;
	private JLabel lblCantidad;
	private JLabel lblDuracion;
	private JLabel lblNombre2;
	private JLabel lblVariable;
	private JSeparator jsep3;
	private JButton btnCancelar1;
	private JButton btnGuardar1;
	private JTextField txtNombre1;
	private JLabel lblValor1;
	private JLabel lblFijo;
	private JSeparator jsep2;
	private JButton btnSeleccionar;
	private JList listEncontrados;
	private JLabel lblEncontrados;
	private JButton btnBuscar;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ActualizarCostos2 inst = new ActualizarCostos2();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public ActualizarCostos2() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				lblBuscar = new JLabel();
				lblBuscar.setText("Buscar Costo:");
			}
			{
				txtCostoBuscar = new JTextField();
				txtCostoBuscar.setText("<nombre del costo a buscar>");
			}
			{
				btnBuscar = new JButton();
				btnBuscar.setText("Buscar");
			}
			{
				lblEncontrados = new JLabel();
				lblEncontrados.setText("Costos encontrados:");
			}
			{
				jsep1 = new JSeparator();
			}
			{
				ListModel listEncontradosModel = 
					new DefaultComboBoxModel(
							new String[] { "Item One", "Item Two" });
				listEncontrados = new JList();
				listEncontrados.setModel(listEncontradosModel);
			}
			{
				btnSeleccionar = new JButton();
				btnSeleccionar.setText("Seleccionar");
			}
			{
				jsep2 = new JSeparator();
				jsep2.setOrientation(SwingConstants.VERTICAL);
			}
			{
				btnGuardar2 = new JButton();
				btnGuardar2.setText("Guardar");
			}
			{
				jsep4 = new JSeparator();
			}
			{
				btnFinalizar = new JButton();
				btnFinalizar.setText("Finalizar");
			}
			{
				btnCancelar2 = new JButton();
				btnCancelar2.setText("Cancelar");
			}
			{
				btnCancelar3 = new JButton();
				btnCancelar3.setText("Cancelar");
			}
			{
				lblFijo = new JLabel();
				lblFijo.setText("Costo fijo");
			}
			{
				lblNombre1 = new JLabel();
				lblNombre1.setText("Nombre costo:");
			}
			{
				lblValor1 = new JLabel();
				lblValor1.setText("Valor:");
			}
			{
				txtNombre1 = new JTextField();
				txtNombre1.setText("<nombre costo>");
			}
			{
				txtValor1 = new JTextField();
				txtValor1.setText("<valor costo>");
			}
			{
				btnGuardar1 = new JButton();
				btnGuardar1.setText("Guardar");
			}
			{
				btnCancelar1 = new JButton();
				btnCancelar1.setText("Cancelar");
			}
			{
				jsep3 = new JSeparator();
			}
			{
				lblVariable = new JLabel();
				lblVariable.setText("Costo variable");
			}
			{
				lblNombre2 = new JLabel();
				lblNombre2.setText("Nombre costo:");
			}
			{
				lblDuracion = new JLabel();
				lblDuracion.setText("Duraci—n:");
			}
			{
				lblCantidad = new JLabel();
				lblCantidad.setText("Cantidad:");
			}
			{
				lblUnitario = new JLabel();
				lblUnitario.setText("Precio unitario:");
			}
			{
				lblPrecioKm = new JLabel();
				lblPrecioKm.setText("Precio por Km:");
			}
			{
				txtNombre2 = new JTextField();
				txtNombre2.setText("<nombre costo>");
			}
			{
				txtDuracion = new JTextField();
				txtDuracion.setText("<duracion>");
			}
			{
				txtCantidad = new JTextField();
				txtCantidad.setText("<cantidad>");
			}
			{
				txtUnitario = new JTextField();
				txtUnitario.setText("<precio unitario>");
			}
			{
				txtPrecioKm = new JTextField();
				txtPrecioKm.setText("<precio por km>");
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				        .addComponent(jsep2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
				        .addComponent(jsep3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addComponent(jsep1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(txtCostoBuscar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(lblBuscar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(lblFijo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				        .addGap(8)
				        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(txtNombre1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
				            .addComponent(btnBuscar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(lblNombre1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(btnGuardar1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				            .addComponent(txtValor1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(lblValor1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				            .addComponent(btnCancelar1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				        .addComponent(lblEncontrados, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(33)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(lblVariable, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addGap(8)
				                .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				                    .addComponent(txtNombre2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(lblNombre2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addComponent(txtDuracion, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(lblDuracion, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                        .addGap(12)))
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                .addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				                    .addComponent(txtCantidad, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(lblCantidad, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(listEncontrados, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
				                .addGap(7)))))
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(btnSeleccionar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(13))
				    .addGroup(thisLayout.createSequentialGroup()
				        .addGap(7)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				                .addComponent(txtUnitario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                .addComponent(lblUnitario, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                .addComponent(btnGuardar2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)))))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(txtPrecioKm, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(lblPrecioKm, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(btnCancelar2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(25)
				.addComponent(jsep4, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(btnCancelar3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(btnFinalizar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(75, 75));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(lblBuscar, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addComponent(txtCostoBuscar, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addGap(64)
				                        .addGroup(thisLayout.createParallelGroup()
				                            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                                .addComponent(btnSeleccionar, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
				                                .addGap(10))
				                            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                                .addPreferredGap(btnSeleccionar, btnBuscar, LayoutStyle.ComponentPlacement.INDENT)
				                                .addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
				                        .addGap(20))))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(jsep1, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
				                .addGap(24))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(listEncontrados, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
				                .addGap(24))
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addComponent(lblEncontrados, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
				                .addGap(110)))
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				        .addComponent(jsep2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				        .addGap(12)
				        .addGroup(thisLayout.createParallelGroup()
				            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                .addGap(0, 0, Short.MAX_VALUE)
				                .addComponent(lblUnitario, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
				                .addGap(10)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(btnCancelar3, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
				                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                        .addComponent(btnFinalizar, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(txtPrecioKm, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
				                        .addGap(62))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
				                        .addGap(60))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(txtDuracion, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
				                        .addGap(60))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(txtNombre2, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
				                        .addGap(60))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, GroupLayout.PREFERRED_SIZE)
				                        .addComponent(txtUnitario, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
				                        .addGap(58)))
				                .addGap(63))
				            .addComponent(jsep3, GroupLayout.Alignment.LEADING, 0, 398, Short.MAX_VALUE)
				            .addGroup(thisLayout.createSequentialGroup()
				                .addGroup(thisLayout.createParallelGroup()
				                    .addComponent(lblNombre1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(lblPrecioKm, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
				                        .addGap(6))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(lblCantidad, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
				                        .addGap(28))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(lblDuracion, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
				                        .addGap(35))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(lblNombre2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				                        .addGap(6))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(lblVariable, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
				                        .addGap(6))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(lblValor1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
				                        .addGap(53))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addComponent(lblFijo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
				                        .addGap(35)))
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addComponent(txtValor1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
				                    .addComponent(txtNombre1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
				                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				                .addGroup(thisLayout.createParallelGroup()
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addGap(0, 0, Short.MAX_VALUE)
				                        .addComponent(btnCancelar2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
				                        .addGap(7))
				                    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                        .addGap(0, 0, Short.MAX_VALUE)
				                        .addComponent(btnGuardar2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
				                        .addGap(7))
				                    .addGroup(thisLayout.createSequentialGroup()
				                        .addGap(0, 7, Short.MAX_VALUE)
				                        .addGroup(thisLayout.createParallelGroup()
				                            .addComponent(btnCancelar1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
				                            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				                                .addComponent(btnGuardar1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
				                                .addGap(7))))))))
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addComponent(jsep4, GroupLayout.PREFERRED_SIZE, 675, GroupLayout.PREFERRED_SIZE)
				        .addGap(0, 58, Short.MAX_VALUE)))
				.addContainerGap(21, 21));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
