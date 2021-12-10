import { useState } from 'react';
import { SelectInput } from './SelectInput';
import SubmitBtn from './SubmitBtn';
import Dashboard from './Dashboard';
export const Formulary = () => {
  const [month, setMonth] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    const data = {
      month: month
    };

    setMonth('');

    //fetch con data
  };

  return (
    <form noValidate onSubmit={handleSubmit}>
      <SelectInput setMonth={setMonth} />
      <SubmitBtn />
      <Dashboard />
      {/* <ContainedButton
        text={ buttonText }
        method={ handleSubmit }
      /> */}
    </form>
  );
};
