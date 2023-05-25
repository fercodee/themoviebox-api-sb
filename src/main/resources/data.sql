-- CREATE TABLE  MOVIES(
--     ID INT PRIMARY KEY NOT NULL, 
--     TITLE VARCHAR(255) NOT NULL, 
--     POSTER_PATH VARCHAR(255) NOT NULL, 
--     VOTE_AVERAGE FLOAT(9), 
--     OVERVIEW VARCHAR(500) NOT NULL, 
--     RELEASE_DATE VARCHAR(10) NOT NULL,
--     POPULARITY FLOAT(9)
-- );

-- CREATE TABLE MOVIE_GENRES(
--     ID INT NOT NULL,
--     NUM_GENRE INT NOT NULL,
--     NAME_GENRE VARCHAR(60),
--     MOVIE_ID INT NOT NULL,
--     PRIMARY KEY (ID),
--     FOREIGN KEY (MOVIE_ID) REFERENCES MOVIES(ID)
-- );

-- INSERT INTO MOVIES VALUES(
--     419704,
--     'Ad Astra',
--     '/xBHvZcjRiWyobQ9kxBhO6B2dtRI.jpg',
--     6.0,
--     'The near future, a time when both hope and hardships drive humanity to look to the stars and beyond. While a mysterious phenomenon menaces to destroy life on planet Earth, astronaut Roy McBride undertakes a mission across the immensity of space and its many perils to uncover the truth about a lost expedition that decades before boldly faced emptiness and silence in search of the unknown.',
--     '15-01-2020',
--     506.482
-- );

-- INSERT INTO MOVIES VALUES(
--     446893,
--     'Trolls World Tour',
--     '/7W0G3YECgDAfnuiHG91r8WqgIOe.jpg',
--     7.7,
--     'Queen Poppy and Branch make a surprising discovery â€” there are other Troll worlds beyond their own, and their distinct differences create big clashes between these various tribes. When a mysterious threat puts all of the Trolls across the land in danger, Poppy, Branch, and their band of friends must embark on an epic quest to create harmony among the feuding Trolls to unite them against certain doom.',
--     '12-03-2020',
--     233.655
-- );

-- INSERT INTO MOVIES VALUES(
--     454626,
--     'Sonic the Hedgehog',
--     '/aQvJ5WPzZgYVDrxLX4R6cLJCEaQ.jpg',
--     7.0,
--     'Based on the global blockbuster videogame franchise from Sega, Sonic the Hedgehog tells the story of the worldâ€™s speediest hedgehog as he embraces his new home on Earth. In this live-action adventure comedy, Sonic and his new best friend team up to defend the planet from the evil genius Dr. Robotnik and his plans for world domination.',
--     '12-02-2020',
--     224.277
-- );

-- INSERT INTO MOVIES VALUES(
--     181812,
--     'Star Wars: The Rise of Skywalker',
--     '/db32LaOibwEliAmSL2jjDF6oDdj.jpg',
--     6.0,
--     'The surviving Resistance faces the First Order once again as the journey of Rey, Finn and Poe Dameron continues. With the power and knowledge of generations behind them, the final battle begins.',
--     '18-12-2019',
--     207.911
-- );

-- INSERT INTO MOVIES VALUES(
--     338762,
--     'Bloodshot',
--     '/8WUVHemHFH2ZIP6NWkwlHWsyrEL.jpg',
--     7.0,
--     'After he and his wife are murdered, marine Ray Garrison is resurrected by a team of scientists. Enhanced with nanotechnology, he becomes a superhuman, biotech killing machineâ€ Bloodshot. As Ray first trains with fellow super-soldiers, he cannot recall anything from his former life. But when his memories flood back and he remembers the man that killed both him and his wife, he breaks out of the facility to get revenge, only to discover that theres more to the conspiracy than he thought.',
--     '05-03-2020',
--     185.731
-- );

-- INSERT INTO MOVIES VALUES(
--     495764,
--     'Birds of Prey (and the Fantabulous Emancipation of One Harley Quinn)',
--     '/h4VB6m0RwcicVEZvzftYZyKXs6K.jpg',
--     7.0,
--     'Harley Quinn joins forces with a singer, an assassin and a police detective to help a young girl who had a hit placed on her after she stole a rare diamond from a crime lord.',
--     '05-02-2020',
--     189.735
-- );

-- INSERT INTO MOVIES VALUES(
--     20850,
--     'Ilsa: She Wolf of the SS',
--     '/kSB8msWxpqE4YENeKZJqd4CMdWd.jpg',
--     5.0,
--     'Ilsa is a warden at a Nazi death camp that conducts experiments on prisoners. Ilsas goal is to prove that woman can withstand more pain and suffering than men and should be allowed to fight on the front lines',
--     '01-10-1975',
--     251.747
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     1,
--     18,
--     'Drama',
--     419704
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     2,
--     878,
--     'Science Fiction',
--     419704
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     3,
--     12,
--     'Adventure',
--     446893
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     4,
--     16,
--     'Animation',
--     446893
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     5,
--     35,
--     'Comedy',
--     446893
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     6,
--     14,
--     'Fantasy',
--     446893
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     7,
--     10402,
--     'Music',
--     446893
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     8,
--     10751,
--     'Romance',
--     446893
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     9,
--     28,
--     'Action',
--     454626
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     10,
--     35,
--     'Comedy',
--     454626
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     11,
--     878,
--     'Science Fiction',
--     454626
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     12,
--     10751,
--     'Romance',
--     454626
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     13,
--     28,
--     'Action',
--     181812
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     14,
--     12,
--     'Adventure',
--     181812
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     15,
--     878,
--     'Science Fiction',
--     181812
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     16,
--     28,
--     'Action',
--     338762
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     17,
--     878,
--     'Science Fiction',
--     338762
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     18,
--     28,
--     'Action',
--     495764
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     19,
--     35,
--     'Comedy',
--     495764
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     20,
--     80,
--     'Crime',
--     495764
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     21,
--     27,
--     'Horror',
--     20850
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     22,
--     53,
--     'Thriller',
--     20850
-- );

-- INSERT INTO MOVIE_GENRES VALUES(
--     23,
--     10752,
--     'War',
--     20850
-- );