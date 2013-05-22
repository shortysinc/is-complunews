package noticias.model;

import noticias.controller.IObserver;
import noticias.controller.UpdateInfo;

public interface IObservable 
{
	void addObserver(IObserver observer);
	void notifyObserver(UpdateInfo updateType);
}
