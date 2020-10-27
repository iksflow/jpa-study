package domain;

import javax.persistence.*;

@Entity
public class Locker {
    @Id @GeneratedValue(strategy = GenerationType.AUTO, generator = "LOCKER_SEQ")
    Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    Member memberId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Member getMemberId() {
        return memberId;
    }

    public void setMemberId(Member memberId) {
        this.memberId = memberId;
    }
}
