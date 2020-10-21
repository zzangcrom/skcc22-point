package nosmokes;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Earn_table")
public class Earn {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long checkInId;
    private Long point;

    @PostPersist
    public void onPostPersist(){
        Earned earned = new Earned();
        BeanUtils.copyProperties(this, earned);
        earned.publishAfterCommit();


    }

    @PrePersist
    public void onPrePersist(){
        EatEarned eatEarned = new EatEarned();
        BeanUtils.copyProperties(this, eatEarned);
        eatEarned.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getCheckInId() {
        return checkInId;
    }

    public void setCheckInId(Long checkInId) {
        this.checkInId = checkInId;
    }
    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }




}
