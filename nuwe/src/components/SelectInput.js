import { months } from '../assets/months';

export const SelectInput = ({ month, setMonth }) => {
  return (
    <>
      <label htmlFor="month">Month</label>
      <select name="month" id="month" value={ month } onChange={ (e) => setMonth(e.target.value) }>
        <option value={ null }>Select a month</option>
        { months !== '' && months.map( (monthItem, id) => <option key={ id } value={ monthItem.name }>{ monthItem.name }</option>) }
      </select>
    </>
  );
};
