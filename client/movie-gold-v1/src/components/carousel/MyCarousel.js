import { Paper } from '@mui/material';
import React from 'react';
import { Carousel } from 'react-material-ui-carousel';
import '/.MyCarousel.css';

const MyCarousel = ({movies}) => {
  return (
    <div>
      <Carousel>
        {
          movies.map((movie) => {
            return(
              <Paper>
                <div className='movie-card-container'>
                  <div className='movie-card'>
                  </div>
                </div>
              </Paper>
            )
          })
        }
      </Carousel>
    </div>
  )
}

export default MyCarousel;