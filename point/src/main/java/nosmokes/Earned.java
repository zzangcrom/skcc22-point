
package nosmokes;

public class Earned extends AbstractEvent {

    private Long id;
    private Long point;
    private Long checkInId;

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
    public Long getUserId() {
        return checkInId;
    }

    public void setUserId(Long checkInId) {
        this.checkInId = checkInId;
    }
}
