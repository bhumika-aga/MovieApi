import React from 'react';
import MyCarousel from '../carousel/MyCarousel';

const Home = ({movies}) => {
  return (
    <MyCarousel movies={movies} />
  )
}

export default Home;