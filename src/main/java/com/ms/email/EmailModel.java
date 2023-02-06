package com.ms.email;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sentEmails")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;

    @Column(name = "owner", nullable = false)
    private String ownerRef;

    @Column(name = "sender", nullable = false)
    private String emailFrom;

    @Column(name = "recipient", nullable = false)
    private String emailTo;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "body", columnDefinition = "TEXT")
    private String text;

    @Column(name = "date")
    private LocalDateTime sendDateEmail;

    @Column(name = "status")
    private StatusEmail statusEmail;

}
