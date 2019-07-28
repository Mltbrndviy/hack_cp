package ru.digital.hack.parent.dao;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "reviews")
public class ReviewsEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long reviewId;

    @Column(name = "website" )
    private String website;

    @Column(name = "company_name" )
    private String company_name;

    @Column(name = "review_text")
    private String review_text;

    @Column(name = "review_rating")
    private String review_rating;

    @Column(name = "review_time" )
    private String review_time;

    @Column(name = "company_type_single_big" )
    private String company_type_single_big;

    @Column(name = "status" )
    private String status;

    @Column(name = "status_text")
    private String status_text;

    @Column(name = "address")
    private String address;

    @Column(name = "lat")
    private String lat;

    @Column(name = "lng")
    private String lng;

    @Column(name = "inn")
    private String inn;

    @Column(name = "okved")
    private String okved;

    @Column(name = "okpo" )
    private String okpo;

    @Column(name = "opf")
    private String opf;


    public ReviewsEntity(String website, String company_name, String review_text, String review_rating, String review_time,
                         String company_type_single_big, String status, String status_text, String address, String lat, String lng,
                         String inn, String okved, String okpo, String opf) {
        this.website = website;
        this.company_name = company_name;
        this.review_text = review_text;
        this.review_rating = review_rating;
        this.review_time = review_time;
        this.company_type_single_big = company_type_single_big;
        this.status = status;
        this.status_text = status_text;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.inn = inn;
        this.okved = okved;
        this.okpo = okpo;
        this.opf = opf;
    }
}
