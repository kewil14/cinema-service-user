package cm.cti.cinema.servicefilm.models;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="Film")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Film {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String titre;
		private String auteur;
		private Date date;
		private String type_film;
		private int censuration;
		@Column(name = "resume",length = 900)
		private String resume;
		private String image;
		
		

}
