package partage;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface servant a être notifié en cas de problème sur un compte
 * @author torguet
 *
 */
public interface Notification extends Remote {
	
	/**
	 * Méthode qui affiche la notification transmise par le serveur
	 * @param message : message de notification
	 * @throws RemoteException  : s'il y a un problème avec RMI
	 */
	public void notifier(String message) throws RemoteException;
}
