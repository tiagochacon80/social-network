package entities;

public class Video implements ActionsVideos {
	private String title;
	private int evaluation;
	private int views;
	private int likes;
	private boolean reproducing;
	
	public Video(String title) {
		this.title = title;
		this.evaluation = 1;
		this.views = 0;
		this.likes = 0;
		this.reproducing = false;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(int evaluation) {
		this.evaluation = evaluation;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public boolean isReproducing() {
		return reproducing;
	}

	public void setReproducing(boolean reproducing) {
		this.reproducing = reproducing;
	}

	@Override
	public void play() {
		
		
	}

	@Override
	public void pause() {
		
		
	}

	@Override
	public void like() {
		
		
	}

}
