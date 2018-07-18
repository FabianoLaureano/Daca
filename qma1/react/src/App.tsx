import * as React from 'react';


import './App.css';
import logo from './logo.svg';

import AlunoList from './AlunoList';



class App extends React.Component<{}, any> {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo"/>
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <AlunoList/>
      </div>
    );
  }
}

export default App;