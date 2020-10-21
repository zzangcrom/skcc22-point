
package nosmokes;

public class CheckOuted extends AbstractEvent {

    private Long id;
    private Long point;
    private Long smokingAreaId;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }
    public Long getAreaId() {
        return smokingAreaId;
    }

    public void setAreaId(Long smokingAreaId) {
        this.smokingAreaId = smokingAreaId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
