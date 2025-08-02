{
  description = "Dev shell para projeto de recomendação de músicas em Java";

  inputs = {
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";
  };

  outputs = { self, nixpkgs }:
    let
      system = "x86_64-linux";
      pkgs = nixpkgs.legacyPackages.${system};
    in {
      devShells.${system}.default = pkgs.mkShell {
        buildInputs = [
          pkgs.openjdk24
          pkgs.maven
          pkgs.zsh
        ];

        shellHook = ''
          echo "Bem-vindo ao dev shell do musicRecommend!"
          echo "Java version: $(java -version 2>&1 | head -n 1)"
          echo "Maven version: $(mvn -v | head -n 1)"
          exec zsh
        '';
      };
    };
}
