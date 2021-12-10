import { useState, useEffect } from 'react';
import { getCountries } from '../assets/api/getCountries';

export const SelectInput = ({ month, setMonth }) => {
  const [countries, setCountries] = useState('');
  useEffect(() => {
    getCountries(setCountries);
  }, []);

  return (
    <>
      <label htmlFor="month">Month</label>
      <select name="month" id="month" value={ month } onChange={ (e) => setMonth(e.target.value) }>
        <option value={ null }>Select a month</option>
        { months !== '' && months.map( (month, id) => <option key={ id } value={ monthItem.name }>{ monthItem.name }</option>) }
      </select>
    </>
  );
};
