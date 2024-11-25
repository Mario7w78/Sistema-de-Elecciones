/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.*;

/**
 *
 * @author vleos
 */
public class RegistroEleccion {
    private final static int MAX = 1000;
    private Eleccion[] array;
    int num;


    public RegistroEleccion() {
        this.array = new Eleccion[MAX];
        num = 0;
    }

    public boolean agregar(Eleccion eleccion) {
        if (num < MAX) {
            array[num] = eleccion;
            num++;
            return true;
        } else {
            return false;
        }
    }

    public Eleccion[] getListaEleccion() {
        Eleccion[] listaEleccion = new Eleccion[num];
        int j = 0;

        for (int i = 0; i < num; i++) {
            listaEleccion[j] = array[i];
            j++;
        }

        return listaEleccion;
    }
    
    public void BorrarIndice(int index){
        for (int i = 0; i < num; i++) {
            if(i >= index){
            array[i] = array[i+1];
            }
        }
        num--;
        
    }
    
    
    public boolean BorrarIndiceCan(int indiceEleccion, int index) {
    try {
        Eleccion eleccion = array[indiceEleccion];
        Candidato[] candidatosActuales = eleccion.getCandidatos();
        
        if (candidatosActuales == null || index >= candidatosActuales.length) {
            return false;
        }
        
        Candidato[] nuevosCandidatos = new Candidato[MAX];
        int nuevaPosicion = 0;
        
        for (int i = 0; i < candidatosActuales.length; i++) {
            if (i != index && candidatosActuales[i] != null) {
                nuevosCandidatos[nuevaPosicion] = candidatosActuales[i];
                nuevaPosicion++;
            }
        }
        
        eleccion.resetCandidatos(nuevosCandidatos, nuevaPosicion);
        return true;
        
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
    
    public boolean BorrarIndiceMesa(int indiceEleccion, int index) {
    try {
        Eleccion eleccion = array[indiceEleccion];
        Mesa[] mesas = eleccion.getMesas();
        
        if (mesas == null || index >= mesas.length) {
            return false;
        }
        
        Mesa[] nuevasmesas = new Mesa[MAX];
        int nuevaPosicion = 0;
        
        for (int i = 0; i < mesas.length; i++) {
            if (i != index && mesas[i] != null) {
                nuevasmesas[nuevaPosicion] = mesas[i];
                nuevaPosicion++;
            }
        }
        
        eleccion.resetMesas(nuevasmesas, nuevaPosicion);
        return true;
        
    } catch (Exception e) {
        e.printStackTrace();
        return false;
        }
    }
    
    public boolean BorrarIndiceMiembro(int indicefecha, int indexmesa, int indexmiembro) {
        try {
        Eleccion eleccion = array[indicefecha];
        Mesa[] MesasActuales = eleccion.getMesas();
        Mesa MesaActual = MesasActuales[indexmesa];
        Miembro [] miembros = MesaActual.getMiembros();
        
        Miembro[] nuevosMiembros = new Miembro[MAX];
        int nuevaPosicion = 0;
        
        for (int i = 0; i < MesasActuales.length; i++) {
            
            if (i != indexmesa && MesasActuales[i] != null) {
                nuevosMiembros[nuevaPosicion] = miembros[i];
                nuevaPosicion++;
            }
        }
        
        MesaActual.resetMiembro(nuevosMiembros, nuevaPosicion);
        MesasActuales[indexmesa] = MesaActual;
        eleccion.resetMesas(MesasActuales,MesasActuales.length);
        
        return true;
        
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
    
    public boolean ActualizarIndice(Eleccion eleccion,int index){

            array[index] = eleccion;
            return true;
        
    }
    public String[] getListaFecha() {
        String[] listaEleccion = new String[num];
        int j = 0;

        for (int i = 0; i < num; i++) {
            listaEleccion[j] = array[i].getFecha();
            j++;
        }

        return listaEleccion;
    }
    
    public Candidato[] getListaCandidatosDeVotacion(int index) {
       Candidato[] listaEleccion = array[index].getCandidatos();
      

        return listaEleccion;

 
    }
    
    public Mesa[] getMesasDeVotacion(int indexfecha) {
   
    Mesa[] listaMesa = array[indexfecha].getMesas();
    
    return listaMesa;
    }
    
    public boolean ModificarCandidato(int indexfecha, int indexcand, Candidato candidato) {
        try {
            Eleccion eleccion = array[indexfecha];
            Candidato[] listaCandidatos = eleccion.getCandidatos();
            
            Candidato[] nuevosCandidatos = new Candidato[MAX];
            
            for (int i = 0; i < listaCandidatos.length; i++) {
                if (i == indexcand) {
                    nuevosCandidatos[i] = candidato;
                } else {
                    nuevosCandidatos[i] = listaCandidatos[i];
                }
            }
            
            eleccion.resetCandidatos(nuevosCandidatos, listaCandidatos.length);
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
   public boolean ModificarMesa(int indexfecha, int indexmesa, Mesa mesaActualizada) {
    try {
        Eleccion eleccion = array[indexfecha];
        Mesa[] listaMesas = eleccion.getMesas();
        
        Mesa mesaActual = listaMesas[indexmesa];
        
        Mesa nuevaMesa = new Mesa(
            mesaActualizada.getUbicacion(),
            mesaActualizada.getNmesa()
        );
        
        Miembro[] miembrosExistentes = mesaActual.getMiembros();
        int numMiembros = mesaActual.getNum();
        for (int i = 0; i < numMiembros; i++) {
            nuevaMesa.agregarMiembro(miembrosExistentes[i]);
        }
        
        listaMesas[indexmesa] = nuevaMesa;
        eleccion.setMesas(listaMesas);
        
        return true;
        
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
   
   public void setArrayCand(Candidato[] array, int indexfecha, int indexcand) {
        Eleccion eleccion = this.array[indexfecha];
        Candidato[] lista = eleccion.getCandidatos();
   }
   
   
    public boolean ModificarMiembro(int indexfecha, int indexmesa, int indexmiembro,Miembro miembro) {
        try {
            Eleccion eleccion = array[indexfecha];
            Mesa[] mesas = eleccion.getMesas();
            Mesa mesaactual = mesas[indexmesa];
            Miembro [] miembros = mesaactual.getMiembros();
            
            int count = 0;
            
            Miembro[] nuevosMiembros = new Miembro[MAX];
            for (int i = 0; i < miembros.length; i++) {
                
                if (i == indexmiembro) {
                    
                    nuevosMiembros[i] = miembro;
                    if(nuevosMiembros[i]!=null){
                    count++;
                    
                    }
                } else {
                    
                    nuevosMiembros[i] = miembros[i];
                    if(nuevosMiembros[i]!=null){
                    count++;
                    
                    }
                }
            }
            
            Mesa[] nuevosMesas= new Mesa[MAX];
            
            int count2 = 0;
            
            for (int i = 0; i < nuevosMesas.length; i++) {
                if (nuevosMesas[i]!=null) {
                    count2++;
                                    }
            }
            
            mesaactual.resetMiembro(nuevosMiembros, count);
            mesas[indexmesa] = mesaactual;
            
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    
    
    
   
    
    
}
