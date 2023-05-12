package java_Test;
// id, 종목명, 순서, 방법
public class GuideDto {
	public String exId;
	public String exList;
	public String exCount;
	public String exGuide;
	
	
	public GuideDto(String exId, String exList, String exCount, String exGuide) {
		super();
		this.exId = exId;
		this.exList = exList;
		this.exCount = exCount;
		this.exGuide = exGuide;
	}
	public GuideDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getExId() {
		return exId;
	}
	public void setExId(String exId) {
		this.exId = exId;
	}
	public String getExList() {
		return exList;
	}
	public void setExList(String exList) {
		this.exList = exList;
	}
	public String getExCount() {
		return exCount;
	}
	public void setExCount(String exCount) {
		this.exCount = exCount;
	}
	public String getExGuide() {
		return exGuide;
	}
	public void setExGuide(String exGuide) {
		this.exGuide = exGuide;
	}
	@Override
	public String toString() {
		return "GuideDto [exId=" + exId + ", exList=" + exList + ", exCount=" + exCount + ", exGuide=" + exGuide + "]";
	}
	
	
	
}
