import * as React from 'react';

interface Aluno {
  id: string;
  nome: string;
}

interface AlunoListProps {
}

interface AlunoListState {
  alunos: Array<Aluno>;
  isLoading: boolean;
}

class AlunoList extends React.Component<AlunoListProps, AlunoListState> {

  constructor(props: AlunoListProps) {
    super(props);

    this.state = {
      alunos: [],
      isLoading: false
    };
  }

  componentDidMount() {
    this.setState({isLoading: true});

    fetch('http://localhost:8080/todosAlunos')
      .then(response => response.json())
      .then(data => this.setState({alunos: data, isLoading: false}));
  }

  render() {
    const {alunos, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    return (
      <div>
        <h2>Alunos List</h2>
        {alunos.map((aluno: Aluno) =>
          <div key={aluno.id}>
            {aluno.nome}<br/>
          </div>
        )}
      </div>
    );
  }
}

export default AlunoList;