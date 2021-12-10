import { useState } from 'react';
import { SelectInput } from './SelectInput';
import SubmitBtn from './SubmitBtn';
export const Formulary = () => {
  const [month, setMonth] = useState('');

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
      <SelectInput setMonth={setMonth} />
      <SubmitBtn method={ handleSubmit } />
    </form>
  );
};
