package java_800_Exam.models;

public class GuideDto {
		
	public String id;
	public String item;
	public int seq;
	public String guide;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getGuide() {
		return guide;
	}
	public void setGuide(String guide) {
		this.guide = guide;
	}
	@Override
	public String toString() {
		return "GuideDto [id=" + id + ", item=" + item + ", seq=" + seq + ", guide=" + guide + "]";
	}
	public GuideDto(String id, String item, int seq, String guide) {
		super();
		this.id = id;
		this.item = item;
		this.seq = seq;
		this.guide = guide;
	}
	public GuideDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
