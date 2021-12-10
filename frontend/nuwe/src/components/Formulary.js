import { useState } from 'react';
import { SelectInput } from './SelectInput';
import SubmitBtn from './SubmitBtn';
import { months } from '../assets/months';
import { years } from '../assets/years';

export const Formulary = () => {
  const [month, setMonth] = useState('');
  const [year, setYear] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    console.log('clicked');

    // const data = {
    //   month: month
    // };

    // setMonth('');

    //fetch con data
  };

  return (
    <form noValidate onSubmit={handleSubmit}>
      <SelectInput value={ month } setMethod={ setMonth } text="month" data={ months }/>
      <SelectInput value={ year } setMethod={ setYear } text="year" data={ years }/>
      <SubmitBtn method={ handleSubmit } />
    </form>
  );
};
