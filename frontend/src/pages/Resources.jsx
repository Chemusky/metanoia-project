import React from 'react';
import { NavBar } from '../components/NavBar/NavBar';
import './Resources.css';
import PodcastsAndVideos from '../components/PodcastsAndVideos/PodcastsAndVideos';

export default function Resources() {
    const handleScrollToSection = (sectionId) => {
        const section = document.getElementById(sectionId);
        if (section) {
            section.scrollIntoView({ behavior: 'smooth' });
        }
    };

    return (
        <>
            <NavBar />
            {/* Sección introductoria */}
            <section className="intro-section layout-box">
                <h2 className="title">Recursos</h2>
                <div className="text-container">
                    <p className="text">
                        Tener la opinion de gente versada en la materia siempre es una buena guía. Hemos hecho esta seleccion podcast y videos que creemos
                        te aportaran luz.
                    </p>
                    {/* iconos */}
                    <div className="icons">
                        <div>
                            <img
                                className="spotify-icon"
                                src="/spotify.svg"
                                alt="Spotify logo"
                                height={70}
                                width={70}
                                onClick={() => handleScrollToSection("podcasts-section")}
                            />
                        </div>
                        <div>
                            <img
                                className="youtube-icon"
                                src="/youtube.svg"
                                alt="Youtube logo"
                                height={70}
                                width={70}
                                onClick={() => handleScrollToSection("videos-section")}
                            />
                        </div>
                    </div>
                </div>
            </section>

            <PodcastsAndVideos />
        </>
    );
}
