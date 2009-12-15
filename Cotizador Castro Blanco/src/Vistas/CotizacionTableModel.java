
package Vistas;

import Entidades.Cotizacion;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

public class CotizacionTableModel extends AbstractTableModel
{
	private String [] columnNames = {"Nro", "Cliente",  "Distancia", "Costo Operativo", "Precio Venta", "Estado",  "Fecha"};
	private Vector<Cotizacion> datalist = new Vector<Cotizacion>();

	public CotizacionTableModel() {

	}

	public CotizacionTableModel(Vector<Cotizacion> l) {
		datalist.addAll(l);
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return this.datalist.size();
	}

	public Cotizacion getCotizacionAt(int row){
		return datalist.get(row);
	}

	public Cotizacion removeCotizacionAt(int row){
		Cotizacion j = datalist.remove(row);
		fireTableDataChanged();
		return j;
	}

	public void addCotizacion(Cotizacion w) {
		datalist.add(w);
		fireTableDataChanged();
	}

	public void addCotizacionList(Vector<Cotizacion> l) {
		datalist.addAll(l);
		fireTableDataChanged();
	}


	public Object getValueAt(int row, int col) {
		Cotizacion c = datalist.get(row);
		switch (col) {
		case 0:
                        return c.getNroCotizacion();
		case 1:
			return c.getCliente().getNombre()+" "+c.getCliente().getApellido();
		case 2:
                        return c.calcularDistanciaTotal()+ " km";
                case 3:
                        return c.getCostoOperativo();     
                case 4:
			return c.getPrecioVenta();
                case 5:
                        return c.getEstado(); //?"Aceptada":"Rechazada";
                case 6:
                        return c.getFechaEmision();
		default:
			return null;
		}
	}

	public Vector<Cotizacion> getDatalist() {
		return datalist;
	}

	public void cleanDatalist(){
		this.datalist.removeAllElements();
		this.fireTableDataChanged();
	}

	@Override
	public String getColumnName(int col){
		return columnNames[col];
	}

        public void setDatalist(Vector<Cotizacion> c){
            this.datalist = c;
            this.fireTableDataChanged();
        }

}
