package be.technifutur.jrtapi.utils;

import be.technifutur.jrtapi.models.entities.Quality;
import be.technifutur.jrtapi.models.entities.Stagiaire;
import be.technifutur.jrtapi.repositories.QualityRepository;
import be.technifutur.jrtapi.repositories.StagiaireRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
@Component
public class DataInit implements InitializingBean {

    private final StagiaireRepository stagiaireRepository;
    private final QualityRepository qualityRepository;

    public DataInit(StagiaireRepository stagiaireRepository, QualityRepository qualityRepository) {
        this.stagiaireRepository = stagiaireRepository;
        this.qualityRepository = qualityRepository;
    }

    @Transactional
    @Override
    public void afterPropertiesSet() throws Exception {




        Stagiaire stagiaire = new Stagiaire();
        stagiaire.setFirstname("Maxime");
        stagiaire.setLastname("Gilot");
        stagiaire.setBirthdate(LocalDate.of(2000,04,30));
        Quality quality = new Quality();
        quality.setContent("Casse-couille absolu");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Juge en permanence");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://imgur.com/wtlyujd.jpg");
        stagiaireRepository.save(stagiaire);

        stagiaire = new Stagiaire();
        stagiaire.setFirstname("Charlotte");
        stagiaire.setLastname("Bartholomé");
        stagiaire.setBirthdate(LocalDate.of(1993,01,04));
        quality = new Quality();
        quality.setContent("Rousse");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Femme");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://imgur.com/1iYPoFJ.png");
        stagiaireRepository.save(stagiaire);

        stagiaire = new Stagiaire();
        stagiaire.setFirstname("Timé");
        stagiaire.setLastname("Prégardien");
        stagiaire.setBirthdate(LocalDate.of(1990,05,8));
        quality = new Quality();
        quality.setContent("Flamboyant");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Séducteur");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://i.imgur.com/3Jaoyah.png");
        stagiaireRepository.save(stagiaire);

        stagiaire = new Stagiaire();
        stagiaire.setFirstname("Daniyal");
        stagiaire.setLastname("Yunusau");
        stagiaire.setBirthdate(LocalDate.of(1996,03,1));
        quality = new Quality();
        quality.setContent("Génie des maths");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Beau comme un dieu");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://cdn.discordapp.com/attachments/1005017845928824913/1087402887048601681/Benja_a_tall_russian_mathematician_cyberpunk_style_large_glasse_2f545c2c-aeed-4d5e-95d1-85631c8ed930.png");
        stagiaireRepository.save(stagiaire);

        stagiaire = new Stagiaire();
        stagiaire.setFirstname("Norman");
        stagiaire.setLastname("Wambrechies");
        stagiaire.setBirthdate(LocalDate.of(1999,03,6));
        quality = new Quality();
        quality.setContent("Catcheur incroyable");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Serviable");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://cdn.discordapp.com/attachments/1032176560372985926/1087496004581998633/Norman.png");
        stagiaireRepository.save(stagiaire);

        stagiaire = new Stagiaire();
        stagiaire.setFirstname("Weijie");
        stagiaire.setLastname("Jing");
        stagiaire.setBirthdate(LocalDate.of(1986,10,25));
        quality = new Quality();
        quality.setContent("Discret");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Kung Fu");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://imgur.com/X2OQMwD.png");
        stagiaireRepository.save(stagiaire);

        stagiaire = new Stagiaire();
        stagiaire.setFirstname("Benjamin");
        stagiaire.setLastname("Renard");
        stagiaire.setBirthdate(LocalDate.of(1984,8,31));
        quality = new Quality();
        quality.setContent("Bébur");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Énorme bite");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://cdn.discordapp.com/attachments/1008571080300052482/1087651113089646662/Norman_a_smart_man_with_black_hair_a_beard_no_glasses_a_crown_w_be4f59ca-88a8-44e2-a3c4-bf1898191cb6.png");
        stagiaireRepository.save(stagiaire);

        stagiaire = new Stagiaire();
        stagiaire.setFirstname("Jérôme");
        stagiaire.setLastname("Carere");
        stagiaire.setBirthdate(LocalDate.of(1988,1,10));
        quality = new Quality();
        quality.setContent("Ponctuel");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Vraiment ponctuel");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://cdn.discordapp.com/attachments/1030097873314000976/1087480259181543424/Benja_a_small_blue_eyed_man_shot_black_hair_smocking_a_cigarett_b5137fc2-3769-4da6-8540-317340a787ce.png");
        stagiaireRepository.save(stagiaire);

        stagiaire = new Stagiaire();
        stagiaire.setFirstname("Julien");
        stagiaire.setLastname("Lejeune");
        stagiaire.setBirthdate(LocalDate.of(1992,10,4));
        quality = new Quality();
        quality.setContent("Pédale comme personne");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Speedrun les toilettes");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://cdn.discordapp.com/attachments/1030097873314000976/1087449817531301898/Benja_a_man_under_pressure_on_a_bicycle_short_hair_45f57269-c5c7-4393-a956-5d301d52d1e7.png");
        stagiaireRepository.save(stagiaire);

        stagiaire = new Stagiaire();
        stagiaire.setFirstname("Julie");
        stagiaire.setLastname("Vanderbyse");
        stagiaire.setBirthdate(LocalDate.of(1990,04,27));
        quality = new Quality();
        quality.setContent("Aigrie");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Aigrie");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://cdn.discordapp.com/attachments/1030097873314000976/1087449817879416832/Benja_a_small_tatooed_woman_30_years_old_long_messy_brown_hair__8a5c2841-8920-4ec4-9604-02f0107a4afb.png");
        stagiaireRepository.save(stagiaire);

        stagiaire = new Stagiaire();
        stagiaire.setFirstname("Valentin");
        stagiaire.setLastname("Poupier");
        stagiaire.setBirthdate(LocalDate.of(1993,2,22));
        quality = new Quality();
        quality.setContent("FFXIV");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Millionnaire");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://imgur.com/btP7DvC.png");
        stagiaireRepository.save(stagiaire);

        stagiaire = new Stagiaire();
        stagiaire.setFirstname("Simon");
        stagiaire.setLastname("Strykers");
        stagiaire.setBirthdate(LocalDate.of(1997,10,28));
        quality = new Quality();
        quality.setContent("Suce comme un aspirateur");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Pense comme Aristote");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://cdn.discordapp.com/attachments/1008571080300052482/1087654151070175262/Norman_a_slim_feminine_man_with_black_hair_a_beard_and_black_cl_8cc374bc-a33e-4794-93f1-336c91ffcfc7.png");
        stagiaireRepository.save(stagiaire);

        stagiaire = new Stagiaire();
        stagiaire.setFirstname("Jean-Michel");
        stagiaire.setLastname("Muramutsa");
        stagiaire.setBirthdate(LocalDate.of(1997,6,5));
        quality = new Quality();
        quality.setContent("Bien trop beau gosse");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        quality = new Quality();
        quality.setContent("Appétissant");
        qualityRepository.save(quality);
        stagiaire.getQualities().add(quality);
        stagiaire.setImage("https://cdn.discordapp.com/attachments/1030097873314000976/1087480259613569114/Benja_a_tall_black_man_elegant_but_humble_sleeping_in_front_of__55776c59-78ab-4759-ab2e-0a276d67c530.png");
        stagiaireRepository.save(stagiaire);
    }
}
