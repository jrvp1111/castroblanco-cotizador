package vistas;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
public class GenerarCotizacion3 extends javax.swing.JFrame {
	private JTable tableResumen;
	private JScrollPane jScrollPane1;
	private JLabel lblResumen;
	private JLabel lblResumenWarn;
	private JButton btnCerrar;
	private JButton btnGerarOV;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GenerarCotizacion3 inst = new GenerarCotizacion3();
				//inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}

	public GenerarCotizacion3() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout(getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Resumen Cotizacion");
			{
				btnCerrar = new JButton();
				btnCerrar.setText("Cerrar");
			}
			{
				btnGerarOV = new JButton();
				btnGerarOV.setText("<html><p align=\"center\">Generar Orden<br>de Viaje</p></html>");
			}
			{
				jScrollPane1 = new JScrollPane();
				{
					TableModel tableResumenModel = 
						new DefaultTableModel(
								new String[][] { { "Distancia Total", "<> KM" }, { "Viajes Cotizados","<>" } , { "Fecha Salida","<>/<>/<>" },{ "Costo Operativo","$<>" }, { "Precio Venta","$<>" }},
								new String[] { "", "" });
					tableResumen = new JTable();
					jScrollPane1.setViewportView(tableResumen);
					tableResumen.setModel(tableResumenModel);
					tableResumen.setPreferredSize(new java.awt.Dimension(599, 171));
				}
			}
			{
				lblResumen = new JLabel();
				lblResumen.setText("RESUMEN DE LA COTIZACION");
			}
			{
				lblResumenWarn = new JLabel();
				lblResumenWarn.setText("Ultima fecha actualizacion de Costos: / / /");
				lblResumenWarn.setFont(new java.awt.Font("AlArabiya",0,10));
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
							.addComponent(lblResumenWarn, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblResumen, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 1, Short.MAX_VALUE)
							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addGroup(thisLayout.createParallelGroup()
									.addComponent(btnCerrar, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnGerarOV, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
									.addContainerGap());
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(thisLayout.createParallelGroup()
							.addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 617, GroupLayout.PREFERRED_SIZE)
							.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
									.addPreferredGap(jScrollPane1, lblResumen, LayoutStyle.ComponentPlacement.INDENT)
									.addComponent(lblResumen, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)
									.addGap(136)
									.addGroup(thisLayout.createParallelGroup()
											.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
													.addComponent(btnGerarOV, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
													.addComponent(btnCerrar, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
													.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
															.addComponent(lblResumenWarn, 0, 222, Short.MAX_VALUE)
															.addGap(16))))));
			pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
