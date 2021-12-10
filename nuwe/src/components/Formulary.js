import { useState } from 'react';

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
    <form noValidate onSubmit={ handleSubmit }>
      <SelectInput setMonth={ setMonth } />

      <ContainedButton
        text={ buttonText }
        method={ handleSubmit }
      />
    </form>
  );
};
