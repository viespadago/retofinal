import './App.css';
import { Formulary } from './components/Formulary';
import Dashboard from './components/Dashboard';
import { Chart } from './components/Chart';

function App() {
  return (
    <div className="App">
      <h1>NUWECASH</h1>
      <Formulary />
      <Dashboard />
      <Chart />
    </div>
  );
}

export default App;
