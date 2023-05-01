.class public final Ls4/n1;
.super Le4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls4/n1$a;
    }
.end annotation


# static fields
.field public static final b:Ls4/n1$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls4/n1$a;

    invoke-direct {v0}, Ls4/n1$a;-><init>()V

    sput-object v0, Ls4/n1;->b:Ls4/n1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Ls4/n1;->b:Ls4/n1$a;

    invoke-direct {p0, v0}, Le4/a;-><init>(Le4/f$c;)V

    return-void
.end method
