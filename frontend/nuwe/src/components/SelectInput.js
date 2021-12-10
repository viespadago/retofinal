export const SelectInput = ({ value, setMethod, text, data }) => {
  return (
    <>
      <select name={text} id={text} value={ value } onChange={ (e) => setMethod(e.target.value) }>
        <option value={ null }>Select a { text }</option>
        { data !== '' && data.map( (dataItem, id) => <option key={ id } value={ dataItem.name }>{ dataItem.name }</option>) }
      </select>
    </>
  );
};
