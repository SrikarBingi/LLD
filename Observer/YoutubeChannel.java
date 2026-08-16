package Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    private List<Observer> subscribers = new ArrayList<>();

    private String latestVideo;

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update(latestVideo);
        }
    }

    public void uploadVideo(String video) {
        this.latestVideo = video;

        System.out.println("Uploaded: " + video);

        notifyObservers();
    }
}
