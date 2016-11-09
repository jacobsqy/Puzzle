import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by raphael on 5/7/16.
 */
public class ControlButtonRestart implements ActionListener
{
	Model model;
	View view;

	/**
	 * Constructer de ControlButtonRestart.
	 *
	 * @param model : Un objet Model
	 * @param view : Un objet View
	 *
	 */

	public ControlButtonRestart(Model model, View view)
	{
		this.model = model;
		this.view = view;
	}

	/**
	 * Réinitialise le jeu.
	 *
	 * @param actionEvent : paramètre nécessaire pour la ré-écriture de la méthode,
	 *                      mais il n'est pas utilisé
	 */

	@Override
	public void actionPerformed(ActionEvent actionEvent)
	{
		model.init(model.getLvl());
		model.mix();
	}
}
