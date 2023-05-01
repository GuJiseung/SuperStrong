.class public final Landroidx/lifecycle/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VM:",
        "Landroidx/lifecycle/f0;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lp4/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp4/b<",
            "TVM;>;"
        }
    .end annotation
.end field

.field public final b:Lk4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk4/a<",
            "Landroidx/lifecycle/k0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lk4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk4/a<",
            "Landroidx/lifecycle/i0$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lk4/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk4/a<",
            "Lu0/a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Landroidx/lifecycle/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TVM;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ll4/d;Lk4/a;Lk4/a;Lk4/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/g0;->a:Lp4/b;

    iput-object p2, p0, Landroidx/lifecycle/g0;->b:Lk4/a;

    iput-object p3, p0, Landroidx/lifecycle/g0;->c:Lk4/a;

    iput-object p4, p0, Landroidx/lifecycle/g0;->d:Lk4/a;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/g0;->e:Landroidx/lifecycle/f0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/lifecycle/g0;->c:Lk4/a;

    .line 6
    .line 7
    invoke-interface {v0}, Lk4/a;->a()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroidx/lifecycle/i0$b;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/lifecycle/g0;->b:Lk4/a;

    .line 14
    .line 15
    invoke-interface {v1}, Lk4/a;->a()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroidx/lifecycle/k0;

    .line 20
    .line 21
    new-instance v2, Landroidx/lifecycle/i0;

    .line 22
    .line 23
    iget-object v3, p0, Landroidx/lifecycle/g0;->d:Lk4/a;

    .line 24
    .line 25
    invoke-interface {v3}, Lk4/a;->a()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lu0/a;

    .line 30
    .line 31
    invoke-direct {v2, v1, v0, v3}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/i0$b;Lu0/a;)V

    .line 32
    .line 33
    .line 34
    const-string v0, "<this>"

    .line 35
    .line 36
    iget-object v1, p0, Landroidx/lifecycle/g0;->a:Lp4/b;

    .line 37
    .line 38
    invoke-static {v1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast v1, Ll4/c;

    .line 42
    .line 43
    invoke-interface {v1}, Ll4/c;->a()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    .line 48
    .line 49
    invoke-static {v0, v1}, Ll4/f;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v0}, Landroidx/lifecycle/i0;->a(Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Landroidx/lifecycle/g0;->e:Landroidx/lifecycle/f0;

    .line 57
    .line 58
    :cond_0
    return-object v0
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method
