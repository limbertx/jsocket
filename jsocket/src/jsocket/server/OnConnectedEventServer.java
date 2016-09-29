package jsocket.server;

import java.util.EventObject;

/**
 * Evento que se lanza dentro de los escuchadores del servidor
 * @author Alex Limbert Yalusqui <limbertyalusqui@gmail.com>
 */
public class OnConnectedEventServer extends EventObject{
    
    public OnConnectedEventServer(Object source) {
        super(source);
    }
    /**
     * Funcion que devuelve los datos llegados del cliente 
     * @return String : datos devuelto del cliente
     */
    public String getDatos(){
        if(this.getSource() instanceof ComunicationServer)
            return ((ComunicationServer) this.source).getDatos();
        else
            return "";
    }
    /**
     * Metodo que envia mensajes a todos los clientes que estan conectados
     * @param msg Mensaje que se enviara a los clientes conectados
     *
    public void sendMessageAll(String msg){
        if(this.getSource() instanceof ManagerConections)
            ((ManagerConections) this.getSource()).sendMessageAll(msg);
    }
    */
    
    /**
     * Devuelve la ip del servidor despues de iniciar el servidor
     * @return String
     */
    public String getIpServer(){
        if(this.getSource() instanceof String)
            return this.getSource().toString();
        else
            return "";
    }
}
