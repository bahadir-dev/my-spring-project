package com.bahd.controller;

import com.bahd.entity.Genre;
import com.bahd.entity.MovieCinema;
import com.bahd.repository.GenreRepository;
import com.bahd.repository.MovieCinemaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class Consume_WebClient {

    private WebClient webClient = WebClient.builder().baseUrl("http://localhost:8080").build();

    private final MovieCinemaRepository movieCinemaRepository;
    private final GenreRepository genreRepository;

    public Consume_WebClient(MovieCinemaRepository movieCinemaRepository, GenreRepository genreRepository) {
        this.movieCinemaRepository = movieCinemaRepository;
        this.genreRepository = genreRepository;
    }

    @GetMapping("/flux-movie-cinemas")
    public Flux<MovieCinema> readAllCinemaFlux(){

        return Flux.fromIterable(movieCinemaRepository.findAll());
    }

//    @GetMapping("/mono-movie-cinema/{id}")
//    public Mono<MovieCinema> readById(@PathVariable("id") Long id){
//
//        return Mono.just(movieCinemaRepository.findById(id).get());
//
//    }

    @GetMapping("/mono-movie-cinema/{id}")
        public ResponseEntity<Mono<MovieCinema>> readdById(@PathVariable("id") Long id){
            return ResponseEntity.ok(Mono.just(movieCinemaRepository.findById(id).get()));
        }


    @PostMapping("/create-genre")
    public Mono<Genre> createGenre(@RequestBody Genre genre){

        Genre createdGenre = genreRepository.save(genre);

        return Mono.just(createdGenre);
      //  return Mono.just(genreRepository.save(genre)); // one line
    }

    @DeleteMapping("/delete-genre/{id}")
    public void deleteGenre(@PathVariable("id") Long id){
        genreRepository.deleteById(id);
    }


    // -----------------WEB CLIENT -----------------

    @GetMapping("/flux")
    public Flux<MovieCinema> readWithWebClient(){

        return webClient
                .get()
                .uri("/flux-movie-cinema")
                .retrieve()
                .bodyToFlux(MovieCinema.class);


        }

}
