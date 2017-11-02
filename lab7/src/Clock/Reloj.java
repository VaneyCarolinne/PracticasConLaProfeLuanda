/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clock;

import Utilidades.DispositivoElectronico;
import java.util.GregorianCalendar;

/**
 *
 * @author Vaney
 */
public class Reloj extends DispositivoElectronico{
    
    private int hora, min, seg, meridiem;
    private int tipoFormato;
    private GregorianCalendar fecha;    
    
    public Reloj(String marca, String modelo, GregorianCalendar fecha) {
        super(marca, modelo);
        this.fecha = fecha;
    }
    
    public Reloj(String marca, String modelo, int hora, int min, int seg, int meridiem, int tipoFormato, GregorianCalendar fecha) {
        super(marca, modelo);
        this.hora = hora;
        this.min = min;
        this.seg = seg;
        this.meridiem = meridiem;
        this.tipoFormato = tipoFormato;
        this.fecha = fecha;
    }


    public int getHora() { return hora; }

    public void setHora(int hora) { this.hora = hora;}

    public int getMin() { return min; }

    public void setMin(int min) {  this.min = min; }

    public int getSeg() { return seg; }

    public void setSeg(int seg) { this.seg = seg; }

    public int getMeridiem() { return meridiem;}

    public void setMeridiem(int meridiem) { this.meridiem = meridiem;}

    public int getTipoFormato() { return tipoFormato; }

    public void setTipoFormato(int tipoFormato) { this.tipoFormato = tipoFormato;}

    public GregorianCalendar getFecha() { return fecha;}

    public void setFecha(GregorianCalendar fecha) { this.fecha = fecha;}    
    
}
