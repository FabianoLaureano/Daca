import * as React from 'react';

interface Tutor {
  id: string;
  nome: string;
}

interface TutorListProps {
}

interface TutorListState {
  tutoress: Array<Tutor>;
  isLoading: boolean;
}

class TutorList extends React.Component<TutorListProps, TutorListState> {

  constructor(props: TutorListProps) {
    super(props);

    this.state = {
      tutores: [],
      isLoading: false
    };
  }

  componentDidMount() {
    this.setState({isLoading: true});

    fetch('http://localhost:8080/tutores')
      .then(response => response.json())
      .then(data => this.setState({tutores: data, isLoading: false}));
  }

  render() {
    const {tutores, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    return (
      <div>
        <h2>Tutoress List</h2>
        {tutores.map((tutor: Tutor) =>
          <div key={tutor.id}>
            {tutor.nome}<br/>
          </div>
        )}
      </div>
    );
  }
}

export default TutorList;