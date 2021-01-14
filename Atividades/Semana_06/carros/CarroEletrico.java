/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author gdsd1
 */
public class CarroEletrico extends Veiculo{
    private int autonomiaBateria;

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }
    
    public CarroEletrico(String placa, String modelo, int ano, int autonomiaBateria){
        super(placa, modelo, ano);
        this.setAutonomiaBateria(autonomiaBateria);
    }
}
